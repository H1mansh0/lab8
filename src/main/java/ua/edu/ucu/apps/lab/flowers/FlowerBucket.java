package ua.edu.ucu.apps.lab.flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public double price() {
        double price = 0;

    for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void add(FlowerPack pack) {
        flowerPacks.add(pack);
    }

    @Override
    public String getDescription() {
        return flowerPacks.toString();
    }
}
