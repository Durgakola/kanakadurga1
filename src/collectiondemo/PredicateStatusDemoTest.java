package collectiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateStatusDemoTest {

    public static void main(String[] args) {

        List<Restaurant> restaurantList = new ArrayList<>();

        Predicate<Payment> statusPredicate = (payment) -> payment.status.equals("Completed");

        BiPredicate<Payment, Boolean> dialLimit = (payment1, limitFlag) ->
                payment1.amount < 10000 && limitFlag;

        List<Payment> paymentList = new ArrayList<>();
        Payment payment1 = new Payment();
        payment1.status = "TECHNICAL-ERROR";
        payment1.accountNumber = "12345";
        payment1.amount = 7000;

        Payment payment2 = new Payment();
        payment2.status = "Completed";
        payment2.accountNumber = "55555";
        payment2.amount = 8000;

        paymentList.add(payment1);
        paymentList.add(payment2);

        for (int i = 0; i < paymentList.size(); i++) {
            Payment paymentObj = paymentList.get(i);
            if (paymentObj.status.equals("Completed") &&
                    paymentObj.amount < 10000) {
                System.out.println("Payment " + paymentObj.accountNumber);
            }
        }
//            Integer<Restaurant> integer=restaurantList.iterator();
            for(int i=0; i<paymentList.size();i++){
                Payment paymentObj=paymentList.get(i);
                if(dialLimit.test(paymentObj,statusPredicate.test(paymentObj))){
                    System.out.println("payment "+paymentObj.accountNumber);

                }

            }
        }
    }

