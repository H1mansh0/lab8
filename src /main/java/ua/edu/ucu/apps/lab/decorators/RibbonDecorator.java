package ua.edu.ucu.apps.lab.decorators;

import ua.edu.ucu.apps.lab.flowers.Item;

public class RibbonDecorator extends ItemDecorator {
    final int addPrice = 40;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return super.price() + addPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in ribbon";
    }
}
