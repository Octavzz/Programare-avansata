package PA03;

public class Book implements Item {
    private String name;
    private int pageNumber;
    private double value;

    public Book(String name, int pageNumber, double value) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.value = value;
    }

    @Override
    public double getWeight() {
        return pageNumber/100;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageNumber=" + pageNumber +
                ", value=" + value +
                '}';
    }
}
