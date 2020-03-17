package PA02;

import java.util.Objects;

public abstract class Vehicle {

    private String name;
    private Depot depot;


    public Vehicle(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDepot(Depot depot) {
        this.depot = depot;
    }

    public String getName() {
        return name;
    }

    public Depot getDepot() {
        return depot;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return name.equals(vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, depot);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", depot=" + depot +
                '}';
    }


}
