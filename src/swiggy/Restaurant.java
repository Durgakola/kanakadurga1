package swiggy;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public List<RestaurantDetails> restarentDetails;

    public List<Dishe> dishesList;

    @Override
    public String toString() {
        return "Restaurant{" +
                "restarentDetails=" + restarentDetails +
                ", dishesList=" + dishesList +
                '}';
    }
}
