package ua.edu.ucu.apps.lab.flowers.filters;

import ua.edu.ucu.apps.lab.flowers.Item;

public interface SearchFilter {
    boolean match(Item item);
}
