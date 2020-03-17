package PA03;

public class Food implements Item {
    private String name;
    private double weight; // → getWeight, getValue

    public Food(String name, double weight, double value) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getValue() {
        return 2*weight;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    //...
}