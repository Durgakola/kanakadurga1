package homeDemo;

public class Fan {
    public String type;
    public int noOfFans;
    public String brand;

    @Override
    public String toString() {
        return "Fan{" +
                "type='" + type + '\'' +
                ", noOfFans=" + noOfFans +
                ", brand='" + brand + '\'' +
                '}';
    }
}
