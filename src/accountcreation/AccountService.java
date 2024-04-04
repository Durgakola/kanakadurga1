package accountcreation;

import java.util.UUID;

public class AccountService {
    public PassBook createAccount(User user){
        PassBook passBook=new PassBook();

        Address add=new Address();
        add.area="taduvoy";
        add.flatNo="2-45";
        add.country="India";
        add.pincode="522409";

        String name= user.firstName+user.lastName;
        passBook.accountHolderName=name;
        passBook.userAddress=user.address;
        passBook.bankaddress=add;
        passBook.accountNumber= UUID.randomUUID().toString();
        passBook.ifscCode="SBI2345665";
        return passBook;



    }
}
