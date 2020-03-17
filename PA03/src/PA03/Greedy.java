package PA03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Greedy implements Algorithm {
    public void solution(Knapsack k, List<Item> list) {
        double capacity = k.getCapacity();
        double value=0;
        List<Item> items = new ArrayList<>();
        list.sort(Comparator.comparingDouble(Item::getValue));
        for (Item i : list) {
            if (capacity - i.getWeight() >= 0) {
                items.add(i);
                value=value+i.getValue();
                capacity -= i.getWeight();
            }
        }
        k.setItems(items);
        System.out.println(value);
    }
}
