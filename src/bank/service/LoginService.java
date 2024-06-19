package bank.service;

import bank.model.User;

public class LoginService {
}

//    int maxLoginNumberOfAttempts=3;
//    public String login(User inputDataUser){
//        String bankUserName="abc";
//        String bankPassword="abc";
//        if(inputDataUser.locked) {
//
//            if (inputDataUser.name.equals(bankUserName) && inputDataUser.password.equals(bankPassword)) {
//                return "login is successful";
//            } else {
//
//                inputDataUser.numberOfAttempts = inputDataUser.numberOfAttempts + 1;
//
//                if (inputDataUser.numberOfAttempts >= maxLoginNumberOfAttempts) {
//                    inputDataUser.locked = true;
//                }
//                return "Invalid login details and left with number of tries" + (maxLoginNumberOfAttempts - inputDataUser.numberOfAttempts);
//            }
//            }else {
//                return "your account is locked";
//            }
//        }
//


//    public  boolean validate(){
//        if(isLocked=true) {
//            return false;
//        }else {
//            return true;
//        }
//    }
//    public String login(User user) {
//        String username = "kanakadurga";
//        String password = "12345";
//
//        if (username.equals(user.userName) && password.equals(user.password)) {
//            System.out.println("login successful");
//        } else {
//            System.out.println("login fail");
//        }
//        return username;
//    }
