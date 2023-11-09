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
        final int PRICEONE = 40;
        final int PRICETWO = 35;
        final double SEPALLENGTHONE = 0.8;
        final double SEPALLENGTHTWO = 0.6;

        deliverDHL = new DHLDeliveryStrategy();
        deliverPost = new PostDeliveryStrategy();
        listOfItems = List.of(new Flower(
            FlowerType.ROSE, PRICEONE, SEPALLENGTHONE, FlowerColor.RED),
                        new Flower(
                FlowerType.CHAMOMILE, PRICETWO, SEPALLENGTHTWO, 
                FlowerColor.BLUE));
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
