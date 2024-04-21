package cardemo;

public class Engine {
    public String type;
    public int hoursePower;
    public Fuel fuel;

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", hoursePower=" + hoursePower +
                ", fuel=" + fuel +
                '}';
    }
}
