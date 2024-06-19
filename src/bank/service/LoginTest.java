package bank.service;

import bank.model.User;

public class LoginTest {
    public static void main(String[] args) {

        User user=new User();
        user.name="cc";
        user.password="abc";

        LoginService service=new LoginService();
//        String first= service.login(user);

    }
}
//        LoginService bankService = new LoginService();
//
//        User user = new User();
//
//        user.userName = "kanakadurga";
//        user.password = "12345";
//
//        String msg = bankService.login(user);
//        System.out.println(msg);
//    }
//}

