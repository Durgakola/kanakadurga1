package homeDemo;

public class Chair extends Furniture {
    public String brand;
    public int noOfChairs;

    @Override
    public String toString() {
        return "Chair{" +
                "brand='" + brand + '\'' +
                ", noOfChairs=" + noOfChairs +
                '}';
    }
}
