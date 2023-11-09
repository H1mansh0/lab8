package ua.edu.ucu.apps.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab.payment.CreditCartPaymentStrategy;
import ua.edu.ucu.apps.lab.payment.PayPalPaymentStrategy;

public class PaymentTest {

    private CreditCartPaymentStrategy credit;
    private PayPalPaymentStrategy payPal;
    final double priceOf = 123.5;
    final double checkingPrice = 123.5;


    @BeforeEach
    public void init() {
        credit = new CreditCartPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
    }

    @Test
    public void testCredit() {
        Assertions.assertEquals(priceOf, credit.pay(checkingPrice));
    }

    @Test
    public void testPayPal() { 
        double checkingPrice = 123.5;
        Assertions.assertEquals(priceOf, payPal.pay(checkingPrice));
    }
}
