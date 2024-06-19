package product;

public class Book extends Product {
    private String author;
    private int pages;

    public Book() {
        super(); // Calls the no-argument constructor of the base class Product
        this.author = "Unknown";
        this.pages = 0;
    }

    public Book(String name, double price, int quantity, String author) {
        super(name,price,quantity);
        this.author = author;
        this.pages = 0;
    }

    public Book(String name, double price, int quantity, String author, int pages) {
        super(name, price, quantity);
        this.author = author;
        this.pages = pages;
    }

    // Getter and Setter methods
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public double calculateValue() {
       return price * pages;
  }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pages=" + pages +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
