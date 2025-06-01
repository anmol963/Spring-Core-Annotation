package org.example;

import org.example.config.AppConfig;
import org.example.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext(AppConfig.class);
//        ApplicationContext is an interface — it cannot be directly instantiated.
//        AnnotationConfigApplicationContext is a concrete class that implements ApplicationContext and
//        is used when you're doing Java-based configuration (i.e., using @Configuration, @ComponentScan, etc.)
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Customer customer = context.getBean(Customer.class);
        customer.placeOrder(2300);
    }
}