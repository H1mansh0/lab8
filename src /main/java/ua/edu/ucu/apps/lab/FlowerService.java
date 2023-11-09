package ua.edu.ucu.apps.lab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Getter;
import ua.edu.ucu.apps.lab.flowers.Flower;

@Service
@Getter
public class FlowerService {
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }
    
    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public void add(Flower flower) {
        flowerRepository.save(flower);
    }
}
