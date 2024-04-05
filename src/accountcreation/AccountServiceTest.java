package accountcreation;

public class AccountServiceTest {
    public static void main(String[] args) {
        Address userAddress=new Address();
        userAddress.flatNo="4-34";
        userAddress.pincode="522409";
        userAddress.country="India";
        userAddress.area="Taduvoy";

        User user=new User();
        user.lastName="durga";
        user.firstName="kanakadurga";
        user.dob="24-2-2000";
        user.mobileNo="9391976191";
        user.aadharNo="123 342 543";
        user.pan="ABC123456h";
        user.address=userAddress;



        AccountService accountService=new AccountService();
        PassBook passBook=accountService.createAccount(user);

        System.out.println(passBook.accountNumber);
//        System.out.println(passBook.accountHolderName);

    }
}
