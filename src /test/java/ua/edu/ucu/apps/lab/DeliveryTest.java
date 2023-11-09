package ua.edu.ucu.apps.lab;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.lab.flowers.Flower;
import ua.edu.ucu.apps.lab.flowers.FlowerColor;
import ua.edu.ucu.apps.lab.flowers.FlowerType;
import ua.edu.ucu.apps.lab.flowers.Item;

public class DeliveryTest {

    private DHLDeliveryStrategy deliverDHL;
    private PostDeliveryStrategy deliverPost;
    private List<Item> listOfItems;


    @BeforeEach
    public void init() {
        int price1 = 40;
        int price2 = 35;
        double sepalLength1 = 0.8;
        double sepalLength2 = 0.6;

        deliverDHL = new DHLDeliveryStrategy();
        deliverPost = new PostDeliveryStrategy();
        listOfItems = List.of(new Flower(
            FlowerType.ROSE, price1, sepalLength1, FlowerColor.RED),
                        new Flower(
                    FlowerType.CHAMOMILE, price2, sepalLength2, FlowerColor.BLUE));
    }

    @Test
    public void testDHL() { 
        Assertions.assertEquals(listOfItems, deliverDHL.deliver(listOfItems));
    }

    @Test
    public void testPost() { 
        Assertions.assertEquals(listOfItems, deliverPost.deliver(listOfItems));
    }
}
