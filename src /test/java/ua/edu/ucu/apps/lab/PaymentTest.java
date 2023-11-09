package ua.edu.ucu.apps.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab.payment.CreditCartPaymentStrategy;
import ua.edu.ucu.apps.lab.payment.PayPalPaymentStrategy;

public class PaymentTest {

    private CreditCartPaymentStrategy credit;
    private PayPalPaymentStrategy payPal;
    private double price;


    @BeforeEach
    public void init() {
        credit = new CreditCartPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
        price = 123.5;
    }

    @Test
    public void testCredit() {
        double checkingPrice = 123.5;
        Assertions.assertEquals(price, credit.pay(checkingPrice));
    }

    @Test
    public void testPayPal() { 
        double checkingPrice = 123.5;
        Assertions.assertEquals(price, payPal.pay(checkingPrice));
    }
}
