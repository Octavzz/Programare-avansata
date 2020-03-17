package PA03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Knapsack k1 = new Knapsack(10);
        List<Item> list = new ArrayList<>();
        Item b1 = new Book("Dragon Rising", 300, 5);
        list.add(b1);
        Item b2 = new Book("A Blade in the Dark", 300, 5);
        list.add(b2);
        Item f1 = new Food("Cabbage", 2, 4);
        list.add(f1);
        Item f2 = new Food("Rabbit", 2, 4);
        list.add(f2);
        Item w1 = new Weapon(WeaponType.Sword, 5, 10);
        list.add(w1);
        k1.addItem(b1);
        k1.addItem(f1);
        k1.addItem(b2);
        //System.out.println(k1.toString());

        Algorithm g = new Greedy();
        g.solution(k1,list);

        Algorithm dp = new DynamicProgramming();
        dp.solution(k1,list);


    }
}
