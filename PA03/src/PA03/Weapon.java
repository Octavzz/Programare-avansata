package PA03;

public class Weapon implements Item {
    private WeaponType type;
    private double weight;
    private double value;

    public Weapon(WeaponType type, double weight, double value) {
        this.type = type;
        this.weight = weight;
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return type.name();
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type=" + type +
                ", weight=" + weight +
                ", value=" + value +
                '}';
    }
}