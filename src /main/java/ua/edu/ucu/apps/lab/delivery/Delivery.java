package ua.edu.ucu.apps.lab.delivery;

import java.util.List;

import ua.edu.ucu.apps.lab.flowers.Item;


public abstract class Delivery {
    public abstract List<Item> deliver(List<Item> items);
}

