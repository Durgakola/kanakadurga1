package shoppingdemo;

public class ProductSpecification {
    public String size;
    public String price;
    public String color;

    @Override
    public String toString() {
        return "ProductSpecification{" +
                "size='" + size + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
