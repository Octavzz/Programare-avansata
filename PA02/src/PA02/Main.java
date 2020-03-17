package PA02;

public class Main {

    public static void main(String[] args) {
	    Depot d1 = new Depot("d1");
	    Depot d2 = new Depot("d2");
	    Vehicle v1 = new Truck("v1");
        Vehicle v2 = new Drone("v2");
        Vehicle v3 = new Car("v3");
	    d1.setVehicles(v1);
	    d1.setVehicles(v2);
	    d2.setVehicles(v3);
	    Client c1 = new Client("c1", 1);
        Client c2 = new Client("c2", 1);
        Client c3 = new Client("c3", 2);
        Client c4 = new Client("c4", 2);
        Client c5 = new Client("c5", 3);

        System.out.println(v1.getName());
        System.out.println(d1.getVehicles());
    }

    public static void compulsory() {

    }
}
