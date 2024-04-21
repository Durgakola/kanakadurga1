package homeDemo;

public class Light {
    public String type;
    public String brand;
    public int noOfLights;

    @Override
    public String toString() {
        return "Light{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", noOfLights=" + noOfLights +
                '}';
    }
}
