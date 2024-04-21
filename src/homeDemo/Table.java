package homeDemo;

public class Table extends Furniture{
    public String type;
    public String brand;

    @Override
    public String toString() {
        return "Table{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
