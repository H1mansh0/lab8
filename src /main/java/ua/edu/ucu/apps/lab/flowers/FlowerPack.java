package ua.edu.ucu.apps.lab.flowers;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }

    void setQuantity(int value) {
        if (value < 1) {
            this.quantity = 1;
        } else {
            this.quantity = value;
        }
    }
}
