package cardemo;

import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        CarService carService=new CarService();
        List<Car> carList=carService.getCarService();
        System.out.println(carList);
    }
}
