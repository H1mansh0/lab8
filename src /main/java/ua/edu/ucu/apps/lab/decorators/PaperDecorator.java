package ua.edu.ucu.apps.lab.decorators;

import ua.edu.ucu.apps.lab.flowers.Item;

public class PaperDecorator extends ItemDecorator{
    final private static int addPrice = 13;

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return super.price() + addPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in paper";
    }
}
