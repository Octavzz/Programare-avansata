package PA04;

public class Resident implements Comparable<Resident> {
    private String name;

    public Resident(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Resident other) {
        return getName().compareTo(other.getName());
    }

    @Override
    public String toString() {
        return "Resident{" +
                "name='" + name + '\'' +
                '}';
    }
}
