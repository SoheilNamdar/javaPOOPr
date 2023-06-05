package shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static java.sql.DriverManager.getConnection;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class ShoppingListDAOImpl implements ShoppingListDAO{
    public static final String HOST = "jdbc:mysql://localhost:3306/shop?serverTimezone=UTC";
    public static final String USER = "DevoPlus";
    public static final String PASSWORD = "s";
    public static final String INSERT_SQL = "INSERT INTO item (name,quantity) VALUES (?,?)";
    public static final String SELECT_SQL = "SELECT * FROM item ORDER BY id DESC LIMIT 1";
    public static final String DELETE = "DELETE FROM item ORDER BY id DESC LIMIT 1";
    @Override
    public List<Item> findAllItems() {
        List<Item> items = new ArrayList<>();
        try (final Connection con = getConnection(HOST, USER, PASSWORD);
             final PreparedStatement select = con.prepareStatement(SELECT_SQL)) {

            final ResultSet resultSet = select.executeQuery();
            while (resultSet.next()) {
                final String name = resultSet.getString("name");
                final int quantity = resultSet.getInt("quantity");
                items.add(new Item(name,quantity));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public void saveItems(List<Item> items) {
        try (final Connection con = getConnection(HOST, USER, PASSWORD);
             final PreparedStatement insert = con.prepareStatement(INSERT_SQL)) {
            insert.setString(1,"orange");
            insert.setInt(2,5);
            insert.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
