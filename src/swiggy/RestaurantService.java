package swiggy;

import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    public List<Restaurant> getRestarent(){
        Address address=new Address();
        address.pincode="522409";
        address.area="Atchampet";
        address.flatNo="12-34";
        address.streetNo=3;

        Address address1=new Address();
        address1.pincode="522409";
        address1.area="kphb";
        address1.flatNo="11-34";
        address1.streetNo=6;

        Dishe dishe=new Dishe();
        dishe.name="chickenfry";
        dishe.price=350;

        RestaurantDetails restarentDetails=new RestaurantDetails();
        restarentDetails.name="mehil";
        restarentDetails.dishe=dishe;
        restarentDetails.rating=9;
        restarentDetails.address=address;


        Dishe dishe1=new Dishe();
        dishe1.name="biryani";
        dishe1.price=350;

        RestaurantDetails restarentDetails1=new RestaurantDetails();
        restarentDetails1.name="mehil1";
        restarentDetails1.dishe=dishe1;
        restarentDetails1.rating=9;
        restarentDetails1.address=address1;



        Restaurant restarent=new Restaurant();
        List<Restaurant> restarentList=new ArrayList<>();
        List<RestaurantDetails> restarentDetailsList=new ArrayList<>();
        List<Dishe> dishesList =new ArrayList<>();

        restarentDetailsList.add(restarentDetails);
        restarentDetailsList.add(restarentDetails1);

        dishesList.add(dishe);
        dishesList.add(dishe1);

        restarent.restarentDetails=restarentDetailsList;
        restarent.dishesList=dishesList;

        restarentList.add(restarent);

        return restarentList;
    }
}
