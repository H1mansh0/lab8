package ua.edu.ucu.apps.lab;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.edu.ucu.apps.lab.flowers.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    
}
