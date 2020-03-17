package PA03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Knapsack {
    private double capacity;
    private List<Item> items = new ArrayList<>();

    public Knapsack(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public String toString() {
        Collections.sort(items);
        return "Knapsack{" +
                "capacity=" + capacity +
                ", items=" + items +
                '}';
    }
}
