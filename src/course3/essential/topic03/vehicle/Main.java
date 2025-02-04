package course3.essential.topic03.vehicle;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Ship ship = new Ship();
        CarTopic3 car = new CarTopic3();

        System.out.println("Plane");
        plane.display();
        System.out.println("------------------------------------");
        System.out.println("Ship");
        ship.display();
        System.out.println("------------------------------------");
        System.out.println("Car");
        car.display();
        System.out.println("------------------------------------");
    }
}
