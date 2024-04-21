package cardemo;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public List<Car> getCarService(){
        Engine engine=new Engine();
        engine.type="Vengine";
        engine.hoursePower=80;

        Fuel fuel=new Fuel();
        fuel.typeOfFuel="petrol";
        engine.fuel=fuel;

        Wheel wheel=new Wheel();
        wheel.brand="Konig";
        wheel.tireType="Tube";
        wheel.wheelType="AlloyWheel";
        wheel.noOfWheel=4;

        Door door=new Door();
        door.frentDoor="Suicide doors";
        door.backDoor="Sliding Doors";

        Seat seat=new Seat();
        seat.numberOfSeats=8;



        Car car=new Car();
        car.model="Carnival";
        car.noOflights=4;
        car.brakes="diskBrakes";
        car.door=door;
        car.engine=engine;
        List<Car> carList=new ArrayList<>();
        List<Wheel> wheelList=new ArrayList<>();
        List<Seat> seatList=new ArrayList<>();

        wheelList.add(wheel);
        seatList.add(seat);

        car.seat=seatList;
        car.wheel=wheelList;
        carList.add(car);

        return carList;

    }
}
