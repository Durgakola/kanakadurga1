package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class CollectionTest {
    public static void main(String[] args) {
        //BiPredicate:
        BiPredicate<Integer, Integer> listSizePredicate = (index, size) -> index < size;

        //Predicate:
        Predicate<String> byName = (name) ->name.equals("kruthinga");

        List<Restaurant> restaurantList = new ArrayList<>();

        Restaurant restaurant1 = new Restaurant();
        restaurant1.name = "mehil";

        Restaurant restaurant2 = new Restaurant();
        restaurant2.name = "kruthinga";

        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);




        for (int i = 0; listSizePredicate.test(i, restaurantList.size()); i++) {
            Restaurant restaurant = restaurantList.get(i);
            System.out.println("Restaurent name     " + restaurant.name);
            // System.out.println(restaurant);
        }


        // to add the list of restaurents into the itreator(container)
        Iterator<Restaurant> iterator=restaurantList.iterator();


        //get the index values #hasNext().
        //get the next index values #next().

        for(;iterator.hasNext();){
            Restaurant restaurant=iterator.next();
           if(byName.test(restaurant.name))
            System.out.println("Iterator Restaurant name " +restaurant.name);
//            restaurantList.add(restaurant);
            //ConcurrentModificationException occures where iterator doesn't allow repetetion of code(infiniteloop)
        }


        restaurantList.forEach(restaurant -> {
            System.out.println("Consumer "+restaurant.name);

                });

    }
}
