package ua.edu.ucu.apps.lab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab.payment.CreditCartPaymentStrategy;

@RestController
@RequestMapping("/api/payment")
public class PaymentCardController {
    final private double PRICE = 18.8;

    @GetMapping("/card")
    public double getPayment() {
        return new CreditCartPaymentStrategy().pay(PRICE);
    }
}
