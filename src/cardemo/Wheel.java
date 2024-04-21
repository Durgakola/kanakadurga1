package cardemo;

public class Wheel {
    public String tireType;
    public String brand;
    public String wheelType;
    public int noOfWheel;

    @Override
    public String toString() {
        return "Wheel{" +
                "tireType='" + tireType + '\'' +
                ", brand='" + brand + '\'' +
                ", wheelType='" + wheelType + '\'' +
                ", noOfWheel=" + noOfWheel +
                '}';
    }
}
