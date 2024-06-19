package product;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", 49.99, 100, " KSR");
        Book book3 = new Book("Clean Code", 34.99, 50, "mahesh babau", 464);

        Product product = new Product("Generic Product", 10.0, 20);
        double productValue = product.calculateValue();
        System.out.println("Value of the product: $" + productValue);

        double bookValue = book2.calculateValue();
        System.out.println("Value of the book '" + book2.getName() + "': $" + bookValue);

        Store store = new Store("My Bookstore");
        store.addProduct(book1);
        store.addProduct(book2);
        store.addProduct(book3);
        store.addProduct(product);

        store.printDetails();

        double totalValue = store.calculateTotalValue();
        System.out.println("Total inventory value: $" + totalValue);
    }
}
