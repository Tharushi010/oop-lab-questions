
package lab08;

public class Book {
    private int bookId;
    private String title;
    private double price;

    public Book(int bookId,
                String title,
                double price) {

        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
