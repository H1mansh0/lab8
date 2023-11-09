package ua.edu.ucu.apps.lab.decorators;

import ua.edu.ucu.apps.lab.flowers.Item;

public class ItemDecorator implements Item{
    private Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
    
}
