package swiggylatestdemo;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    public List<Payment> payments;

    public PaymentService() {
        this.payments=new ArrayList<>();
    }

    public void makePayment(double amount,String paymentMehod){
        Payment payment=new Payment(amount,paymentMehod);
        payments.add(payment);
        System.out.println("Payment of Rs:" + amount + " made using " +paymentMehod);
    }
}
