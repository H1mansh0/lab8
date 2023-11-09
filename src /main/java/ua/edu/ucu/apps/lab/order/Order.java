package ua.edu.ucu.apps.lab.order;

import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.lab.delivery.Delivery;
import ua.edu.ucu.apps.lab.flowers.Item;
import ua.edu.ucu.apps.lab.payment.Payment;

@Getter
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;


    public void setPaymentStrategy(Payment newPayment) {
        this.payment = newPayment;
    }

    public void setDeliveryStrategy(Delivery newDelivery) {
        this.delivery = newDelivery;
    }

    public void calculateTotalPrice() {
        int res = 0;

        for (int i  = 0; i <= items.size(); i++) {
            res += items.get(i).price();
            System.out.println(res);
        }
    }

    public void processOrder() {

    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
