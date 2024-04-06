package restarent;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public List<Restarent> getService(){
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

        Dishes deeshes=new Dishes();
        deeshes.name="chickenfry";
        deeshes.price=350;

        RestarentDetails restarentDetails=new RestarentDetails();
        restarentDetails.name="platform 65";
        restarentDetails.deeshes=deeshes;
        restarentDetails.rating=9;
        restarentDetails.address=address;



        Dishes deeshes1=new Dishes();
        deeshes1.name="biryani";
        deeshes1.price=350;

        RestarentDetails restarentDetails1=new RestarentDetails();
        restarentDetails1.name="kruthinga";
        restarentDetails1.deeshes=deeshes1;
        restarentDetails1.rating=9;
        restarentDetails1.address=address1;


        Restarent restarent=new Restarent();
        List<Restarent> restarentList=new ArrayList<>();
        List<RestarentDetails> restarentDetailsList=new ArrayList<>();
        List<Dishes> deeshesList =new ArrayList<>();

        restarentDetailsList.add(restarentDetails);
        restarentDetailsList.add(restarentDetails1);

        deeshesList.add(deeshes);
        deeshesList.add(deeshes1);

        restarent.restarentDetails=restarentDetailsList;
        restarent.deeshesList=deeshesList;

        restarentList.add(restarent);

        return restarentList;
    }
}
