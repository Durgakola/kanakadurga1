package createaccount;

public class AccountService {
    public double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance -=amount;
            System.out.println("withdraw : "+amount);
        }else{
            System.out.println("Insufficient funds for this withdrawal");
        }
    }
}
