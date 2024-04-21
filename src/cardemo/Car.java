package cardemo;

import java.util.List;

public class Car {
    public String model;
    public String brakes;
    public int noOflights;
    public List<Wheel> wheel;
    public List<Seat> seat;
    public Engine engine;
    public Door door;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brakes='" + brakes + '\'' +
                ", noOflights=" + noOflights +
                ", wheel=" + wheel +
                ", seat=" + seat +
                ", engine=" + engine +
                ", door=" + door +
                '}';
    }
}
