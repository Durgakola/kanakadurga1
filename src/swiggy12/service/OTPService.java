package swiggy12.service;

import swiggy12.model.OTP;
import swiggy12.model.User;

import java.util.Date;
import java.util.UUID;

public class OTPService {
    public User userInstance;
    public OTP otpInstance;

    public OTP generateOTP(User inputUser){
        userInstance=inputUser;
        OTP aaa=new OTP();
        OTP abc=new OTP();
        aaa.number= UUID.randomUUID().toString();
        aaa.creationDate=new Date();
        long currentTimeInMills=aaa.creationDate.getTime();
        //15 mints -> 900 sec -> 900*1000 =900000;
        long endTimeInMills= currentTimeInMills +900000;
        aaa.expiryDate=new Date(endTimeInMills);
        otpInstance=aaa;
        return aaa;
    }

    public String otpValidation(OTP inputOtp,User inputUser){
        if(inputOtp.number.equals(otpInstance.number)&& inputUser.mobileNumber.equals(otpInstance.mobileNumber)){
            return "OTP validation is successful";
        }else{
            return "Invalid OTP";
        }
    }
}
