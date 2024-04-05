package shoppingdemo;

public class Product {
    public String type;
    public String price;
    public String barcode;
    public String brand;
    public ProductSpecification productSpecification;

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", barcode='" + barcode + '\'' +
                ", brand='" + brand + '\'' +
                ", productSpecification=" + productSpecification +
                '}';
    }
}
