import java.util.*
;
class book {
    String title;
    String author;
    double price;

    book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }

    public static void main(String[] args) {
        book b1 = new book("Java Programming", "James Gosling", 599.99);
        b1.displayBookDetails();
    }
}
