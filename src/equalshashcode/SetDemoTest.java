package equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SetDemoTest {
    public static void main(String[] args) {
        Set<Car> carSet=new HashSet<>();

        Car car1=new Car();
        car1.name="BMW";

        Car car2=new Car();
        car2.name="BMW";

        carSet.add(car1);
        carSet.add(car2);
        System.out.println(carSet);



        Address add1=new Address();
        add1.area="KPHB";
        add1.flatNo="123-123";
        add1.pincode="522790";
        add1.street="kphb 5th phase";
        add1.state="Andhra";

        Address add2=new Address();
        add2.area="KPHB";
        add2.flatNo="123-123";
        add2.pincode="522790";
        add2.street="kphb 5th phase";
        add2.state="Andhra";

        Set<Address> addressSet=new HashSet<>();
        addressSet.add(add1);
        addressSet.add(add2);
        System.out.println(add1.hashCode());
        System.out.println(add2.hashCode());
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(addressSet);


    }
}
