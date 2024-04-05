package shopping;

public class UserSpecification {
   public String color;
    public int price;
    public String size;
    public String type;

    @Override
    public String toString() {
        return "SelectItem{" +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
