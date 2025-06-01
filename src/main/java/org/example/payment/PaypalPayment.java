package org.example.payment;

import org.example.services.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaypalPayment implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}
