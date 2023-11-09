package ua.edu.ucu.apps.lab.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab.flowers.Flower;
import ua.edu.ucu.apps.lab.flowers.FlowerColor;
import ua.edu.ucu.apps.lab.flowers.FlowerType;
import ua.edu.ucu.apps.lab.flowers.Item;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryDHLController {
    final int priceOf = 40;
    final double sepalLength = 0.8;

    @GetMapping("/dhl")
    public List<Item> getDelivery() {
        return new DHLDeliveryStrategy().deliver(
        List.of(new Flower(
        FlowerType.ROSE, priceOf, sepalLength, FlowerColor.RED)));
    }
}
