package ua.edu.ucu.apps.lab.decorators;

import ua.edu.ucu.apps.lab.flowers.Item;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return super.price() + 40;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in ribbon";
    }
}
