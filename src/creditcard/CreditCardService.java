package creditcard;

import java.util.Date;
import java.util.UUID;

public class CreditCardService {
    public CreditCard card(User user) {
        CreditCard creditCard = new CreditCard();
        creditCard.holderName = user.name;
        creditCard.cardNo = UUID.randomUUID().toString();
        creditCard.bankName = "sbi";
        creditCard.cvv = UUID.randomUUID().toString();
        creditCard.cardExpiry = new Date();
        creditCard.cardlimit=20000;
        creditCard.availableBalance= creditCard.cardlimit;

        return creditCard;
    }
}
