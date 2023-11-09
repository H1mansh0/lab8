package ua.edu.ucu.apps.lab.delivery;

import java.util.List;

import ua.edu.ucu.apps.lab.flowers.Item;


public class PostDeliveryStrategy extends Delivery {
    @Override
    public List<Item> deliver(List<Item> items) {
        return items;
    }
}
