package io.sonnetsaif.aop_concept;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService{

    @Override
    public void makeDebitPayment(String str) {
        System.out.println("Amount Debited:");
    }
    public void makeCreditPayment() {
        System.out.println("Amount Credited:");
    }

}
