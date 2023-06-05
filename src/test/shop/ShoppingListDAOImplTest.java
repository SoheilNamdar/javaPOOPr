package shop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.DriverManager.*;
import static org.assertj.core.api.Assertions.*;

public class ShoppingListDAOImplTest {

    public static final String HOST = "jdbc:mysql://localhost:3306/shop?serverTimezone=UTC";
    public static final String USER = "DevoPlus";
    public static final String PASSWORD = "s";
    public static final String ERROR = "connection to database is impossible";
    public static final String INSERT_SQL = "INSERT INTO item (name,quantity) VALUES (?,?)";
    public static final String SELECT_SQL = "SELECT * FROM item ORDER BY id DESC LIMIT 1";
    public static final String DELETE = "DELETE FROM item ORDER BY id DESC LIMIT 1";
    public static final String DELETE_SQL = DELETE;

    @Test
    void should_connect_to_my_sql_database() {
        try (final Connection con = getConnection(HOST, USER, PASSWORD)) {  //DevoPlus //s
            if(con == null) {
                fail(ERROR);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            fail(ERROR);
        }
    }

    @Test
    void should_insert_read_and_delete_an_item_in_database() {
        try (final Connection con = getConnection(HOST, USER, PASSWORD);
             final PreparedStatement insert = con.prepareStatement(INSERT_SQL);
             final PreparedStatement select = con.prepareStatement(SELECT_SQL);
             final PreparedStatement delete = con.prepareStatement(DELETE_SQL)) {
            insert.setString(1,"orange");
            insert.setInt(2,5);
            insert.executeUpdate();

            final ResultSet resultSet = select.executeQuery();
            while (resultSet.next()) {
                final String name = resultSet.getString("name");
                final int quantity = resultSet.getInt("quantity");

                assertThat(name).isEqualTo("orange");
                assertThat(quantity).isEqualTo(5);
            }
            delete.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            fail(ERROR);
        }
    }
}
