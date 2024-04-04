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

        user.address=userAddress;
        user.mobileNo="9391976191";
        user.aadharNo="2345678";
        user.pan="456789234";


        AccountService accountService=new AccountService();
        PassBook passBook=accountService.createAccount(user);
        System.out.println(passBook.accountNumber);
        System.out.println(passBook.accountHolderName);

    }
}
