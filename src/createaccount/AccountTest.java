package createaccount;

public class AccountTest {
    public static void main(String[] args) {
        AccountService service=new AccountService();
        service.deposit(2000);
        service.withdraw(200);
    }
}
