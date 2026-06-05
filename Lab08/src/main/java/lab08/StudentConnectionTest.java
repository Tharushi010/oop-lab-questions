
package lab08;
import java.sql.Connection;
import java.sql.SQLException;

public class StudentConnectionTest {
    public static void main(String[] args) {

        try {

            Connection con =
                    StudentDatabaseConnection.getConnection();

            System.out.println(
                    "Database connected successfully.");

            con.close();

        } catch (SQLException e) {
            System.out.println("Database connection error.");
            e.printStackTrace();
}
        }
    }
