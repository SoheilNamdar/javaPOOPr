package shop;

import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.SQLException;
import static java.sql.DriverManager.*;
import static org.assertj.core.api.Assertions.*;

public class ShoppingListDAOImplTest {
    @Test
    void should_connect_to_my_sql_database() {
        try (final Connection con = getConnection("jdbc:mysql://localhost:3306/shop?serverTimezone=UTC", "DevoPlus","s")) {
            if(con == null) {
                fail("connection to database is impossible");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            fail("connection to database is impossible");
        }
    }
}
