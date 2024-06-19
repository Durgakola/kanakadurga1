package product;

import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Product> products;

    public Store(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.calculateValue();
        }
        return totalValue;
    }

    public void printDetails() {
        System.out.println("Products in store '" + name + "':");
        for (Product product : products) {
            product.printDetails();
            System.out.println(); // Add a blank line between products
        }
    }

}
