
package lab08;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {
    public void addBook(Book book) {

        String sql =
        "INSERT INTO books(book_id,title,price)"
        + " VALUES(?,?,?)";

        try(
            Connection con =
            DatabaseConnection.getConnection();

            PreparedStatement ps =
            con.prepareStatement(sql)
        ){

            ps.setInt(1, book.getBookId());
            ps.setString(2, book.getTitle());
            ps.setDouble(3, book.getPrice());

            ps.executeUpdate();

            System.out.println(
            "Book added successfully.");
             }catch(SQLException e){

            e.printStackTrace();
        }
    }

    public void displayBooks() {

        String sql =
        "SELECT * FROM books";

        try(
            Connection con =
            DatabaseConnection.getConnection();

            PreparedStatement ps =
            con.prepareStatement(sql);

            ResultSet rs =
            ps.executeQuery()
        ){
          while(rs.next()){

                System.out.println(
                    rs.getInt("book_id") + " "
                    + rs.getString("title") + " "
                    + rs.getDouble("price")
                );
            }

        }catch(SQLException e){

            e.printStackTrace();
        }
    }
}
