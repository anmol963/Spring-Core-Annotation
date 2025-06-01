package org.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") // A new object is created each time
public class CheckoutService {

    @Autowired
//    @Qualifier("paypalPayment") // Specify which PaymentService to inject
    private PaymentService paymentService;

    public void checkout(double amount) {
        System.out.println("Checkout started...");
        paymentService.pay(amount);
    }
}
