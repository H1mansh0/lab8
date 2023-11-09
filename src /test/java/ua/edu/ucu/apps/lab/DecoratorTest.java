package ua.edu.ucu.apps.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab.decorators.PaperDecorator;
import ua.edu.ucu.apps.lab.decorators.RibbonDecorator;
import ua.edu.ucu.apps.lab.flowers.Flower;
import ua.edu.ucu.apps.lab.flowers.Item;

class DecoratorTest {

    @Test
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        Item tree1 = new PaperDecorator(new Flower());
        assertEquals(tree1.getDescription(),
                "Flower in paper");

        Item tree2 = new RibbonDecorator(new PaperDecorator(new PaperDecorator(new Flower())));
        assertEquals(tree2.getDescription(),
                "Flower in paper in paper in ribbon");
    }

}
