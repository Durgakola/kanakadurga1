package swiggy;

import java.util.List;

public class Restaurant {
    public List<RestaurantDetails> restarentDetails;

    public List<Dishe> dishesList;

    @Override
    public String toString() {
        return "Restarent{" +
                "restarentDetails=" + restarentDetails +
                ", deeshesList=" + dishesList +
                '}';
    }
}
