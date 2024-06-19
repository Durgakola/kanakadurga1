package swiggy12.service;

import swiggy12.model.OTP;
import swiggy12.model.Restaurant;

import java.util.Date;
import java.util.UUID;

public class SwiggyService {
        public static Restaurant restaurantStaticVarible;

//    public OTP registerRestaurant(Restaurant rrr, Restaurant r, Restaurant rr) {
//        restaurantStaticVarible = rrr;
//        OTP otp = new OTP();
//        otp.number = UUID.randomUUID().toString();
//        otp.creationDate = new Date();
//
//        long currentTimeInMills = otp.creationDate.getTime();
//
//        // 15 mints -> 900 sec -> 900*1000=900000;
//
//        long endTimeInMills = currentTimeInMills + 900000;
//        otp.expiryDate = new Date(endTimeInMills);
//
//        return otp;
//
//    }

    public OTP registerRestaurant(Restaurant rrr) {
        restaurantStaticVarible = rrr;
        OTP otp = new OTP();
        otp.number = UUID.randomUUID().toString();
        otp.creationDate = new Date();

        long currentTimeInMills = otp.creationDate.getTime();

        // 15 mints -> 900 sec -> 900*1000=900000;

        long endTimeInMills = currentTimeInMills + 900000;
        otp.expiryDate = new Date(endTimeInMills);
        return otp;
    }
}