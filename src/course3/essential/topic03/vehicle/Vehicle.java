package course3.essential.topic03.vehicle;

public class Vehicle {
    String coordinates;
    int price;
    double speed;
    int yearBuilt;

    public Vehicle(String coordinates, int price, double speed, int yearBuilt) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.yearBuilt = yearBuilt;
    }

    public void display() {

        System.out.println("Coordinates: " + coordinates);
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Year Built: " + yearBuilt);
    }

    public static void main(String[] args) {
    }
}
