package swiggy;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        RestaurantService service=new RestaurantService();
        List<Restaurant> restarents=service.getRestarent();
        System.out.println(restarents);
    }
}
