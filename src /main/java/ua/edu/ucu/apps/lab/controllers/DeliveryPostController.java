package ua.edu.ucu.apps.lab.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.lab.flowers.Flower;
import ua.edu.ucu.apps.lab.flowers.FlowerColor;
import ua.edu.ucu.apps.lab.flowers.FlowerType;
import ua.edu.ucu.apps.lab.flowers.Item;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryPostController {
    final static private int price = 40;
    final static private double sepalLength = 0.8;

    @GetMapping("/post")
    public List<Item> getDelivery() {
        return new PostDeliveryStrategy().deliver(
        List.of(new Flower(
        FlowerType.ROSE, price, sepalLength, FlowerColor.RED)));
    }
}
