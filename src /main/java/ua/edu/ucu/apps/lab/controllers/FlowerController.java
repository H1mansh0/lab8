package ua.edu.ucu.apps.lab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab.FlowerService;
import ua.edu.ucu.apps.lab.flowers.Flower;


@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    final private FlowerService FLOWERSERVICE;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.FLOWERSERVICE = flowerService;
    }

    @GetMapping("/list")
    public List<Flower> getFlowers() {
        return FLOWERSERVICE.getFlowers();
    }

    @PostMapping("/add")
    public void addFlower(@RequestBody Flower flower) {
        FLOWERSERVICE.add(flower);
    }
}
