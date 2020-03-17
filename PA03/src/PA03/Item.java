package PA03;

public interface Item extends Comparable<Item> {
    String getName();
    double getValue();
    double getWeight();

    default double profitFactor() {
        return getValue() / getWeight();
    }

    default int compareTo(Item other) {
        return getName().compareTo(other.getName());
    }

}
