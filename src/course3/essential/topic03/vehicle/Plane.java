package course3.essential.topic03.vehicle;

public class Plane extends Vehicle {
    private double height;
    private int numberOfSeats;

    public Plane() {
        super("12.123.2",1200000,700,2020 );
        this.height = 10.15;
        this.numberOfSeats = 50;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("height: " + this.height);
        System.out.println("seats: " + this.numberOfSeats);
    }
}
