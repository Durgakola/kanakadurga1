package creditcard;

import java.util.Date;

public class CreditCard {
    public String holderName;
    public String cardNo;
    public String cvv;
    public String bankName;
    public Date cardExpiry;
    public int cardlimit;
    public int availableBalance;

    @Override
    public String toString() {
        return "CreditCard{" +
                "holderName='" + holderName + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", cvv='" + cvv + '\'' +
                ", bankName='" + bankName + '\'' +
                ", cardExpiry=" + cardExpiry +
                ", availableBalance=" + availableBalance +
                '}';
    }
}
