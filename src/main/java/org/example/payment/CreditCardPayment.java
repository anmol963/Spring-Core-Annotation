package org.example.payment;

import org.example.services.PaymentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // Marks this as the default bean when multiple candidates
@Primary
public class CreditCardPayment implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}
