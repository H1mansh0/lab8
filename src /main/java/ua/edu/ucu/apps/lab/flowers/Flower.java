package ua.edu.ucu.apps.lab.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter @NoArgsConstructor @ToString
@Entity
public class Flower implements Item {
    @Id
    private int id;
    @Getter
    private FlowerType flowerType;
    @Getter
    private double price;
    @Getter
    private double sepalLength;
    private FlowerColor color;

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
    }

    public Flower(FlowerType newFlowerType,
                int newPrice,
                double newSepalLength,
                FlowerColor newColor) {
        this.flowerType = newFlowerType;
        this.price = newPrice;
        this.sepalLength = newSepalLength;
        this.color = newColor;
    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Flower";
    }
}
