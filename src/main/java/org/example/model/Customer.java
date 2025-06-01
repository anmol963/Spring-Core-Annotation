package org.example.model;

import org.example.services.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    @Autowired
    private CheckoutService checkoutService;

    public void placeOrder(double amount) {
        System.out.println("Customer placing order.....");
        this.checkoutService.checkout(amount);
    }
}
