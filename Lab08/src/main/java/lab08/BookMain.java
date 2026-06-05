
package lab08;

public class BookMain {
    public static void main(String[] args) {

        BookDAO dao =
                new BookDAO();

        Book b1 =
                new Book(1, "Java Programming", 2500.00);

        dao.addBook(b1);

        dao.displayBooks();
    }
}
