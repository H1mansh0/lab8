package ua.edu.ucu.apps.lab.flowers;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.apps.lab.flowers.filters.SearchFilter;

public class Store {
    private List<Item> items;

    public List<Item> search(SearchFilter filter) {
        List<Item> foundedItems = new ArrayList<>();

        for (Item item: items) {
            if (filter.match(item)) {
                foundedItems.add(item);
            } 
        }
        return null;
    }
}
