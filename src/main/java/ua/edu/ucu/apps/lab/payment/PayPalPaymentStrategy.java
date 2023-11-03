package ua.edu.ucu.apps.lab.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}
