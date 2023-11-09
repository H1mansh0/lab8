package ua.edu.ucu.apps.lab.decorators;

import lombok.Getter;
import ua.edu.ucu.apps.lab.flowers.Item;

@Getter
public class BasketDecorator extends ItemDecorator {
    private final int addPrice = 4;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return super.price() + addPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in basket";
    }
}
