package course3.essential.topic03.vehicle;

public class Ship extends Vehicle {
    private String portName;
    private int numberOfSeats;

    public Ship() {
        super("45.678.9", 5000000, 40, 2015);
        this.portName = "Genoa";
        this.numberOfSeats = 147;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Port: " + this.portName);
        System.out.println("Number of Seats: " + this.numberOfSeats);
    }
}
