package swiggy;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        RestaurantService service=new RestaurantService();
        List<Restaurant> restarents=service.getRestarent();
        System.out.println(restarents);

//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter Your Restaurent: ");
//        String name= scan.nextLine();
//        System.out.println("Restaurent name "+name);
    }
}
