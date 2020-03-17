package PA04;

public class Hospital implements Comparable<Hospital> {
    private int capacity;
    private String name;

    public Hospital(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Hospital other) {
        return getName().compareTo(other.getName());
    }

    public String toString()
    {
        return name;
    }
}
