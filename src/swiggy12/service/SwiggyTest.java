package swiggy12.service;

import swiggy12.model.Menu;
import swiggy12.model.OTP;
import swiggy12.model.Restaurant;

public class SwiggyTest {
    public static void main(String[] args) {
        Restaurant r=new Restaurant();
        Menu m=new Menu();

        r.name="KFC";
        r.area="KPHB";
        r.flatNo="109";
        r.pincode="522409";
        r.landMark="SVR womens pg";
        r.street="kphb 5th phase";

        m.name="Biryani";
        m.price=500;
        m.status=true;
        //linking menu object ref to variable of restaurant obj ref
        //linking restaurant obj ref to variable of menu object ref
        //assign the value for the restaurant variable menu to Menu class object reference
        Restaurant r1=new Restaurant();
        r1.name="A";

        Restaurant r2=new Restaurant();
        r1.name="B";

        Restaurant r3=new Restaurant();
        r1.name="C";

        r.menu=m;  //link to menu to Restaurant



        SwiggyService service=new SwiggyService();

        OTP testOtp =service.registerRestaurant(r);
       OTP inputOTP=testOtp;
//     String responce=service.otpValidation(inputOTP,r.user);

//        System.out.println(" responce "+responce);


        System.out.println( "r1 name "+r1.name);


        System.out.println("OTP number "+testOtp.number);
        System.out.println("OTP creationDate number "+testOtp.creationDate);
        System.out.println("OTP expiryDate "+testOtp.expiryDate);

    }
}
