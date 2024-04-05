package shopping;


public class ProductDetails {
    public String brandName;
    public int price;
    public String Type;
    public String color;
    public UserSpecification userSpecification;



    public UserSpecification getUserSpecification() {
        return userSpecification;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                ", Type='" + Type + '\'' +
                ", color='" + color + '\'' +
                ", userSpecification=" + userSpecification +
                '}';
    }
}
