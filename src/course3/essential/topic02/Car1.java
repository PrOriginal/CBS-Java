package course3.essential.topic02;

public class Car1 {
    public int year;
    public double speed;
    public int weight;
    public String color;

    public Car1(){
        this.year = 0;
        this.speed = 0.0;
        this.weight = 0;
        this.color = "black";
    }

    public Car1(int year){
        this.year = year;
        this.speed = 0.0;
        this.weight = 0;
        this.color = "black";
    }

    public Car1(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 0;
        this.color = "black";
    }

    public Car1(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "black";
    }

    public Car1(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
    public static void main(String[] args) {
        // Використання конструктора за замовчуванням
        Car1 defaultCar = new Car1();
        System.out.println("Default car: " + defaultCar.year + ", " + defaultCar.speed + ", " + defaultCar.weight + ", " + defaultCar.color);

        // Використання конструктора з 1 параметром
        Car1 car1 = new Car1(1990);
        System.out.println("Car 1: " + car1.year + ", " + car1.speed + ", " + car1.weight + ", " + car1.color);

        // Використання конструктора з 2 параметрами
        Car1 car2 = new Car1(1991, 120.5);
        System.out.println("Car 2: " + car2.year + ", " + car2.speed + ", " + car2.weight + ", " + car2.color);

        // Використання конструктора з 3 параметрами
        Car1 car3 = new Car1(2000, 150.0, 1200);
        System.out.println("Car 3: " + car3.year + ", " + car3.speed + ", " + car3.weight + ", " + car3.color);

        // Використання конструктора з 4 параметрами
        Car1 car4 = new Car1(2025, 180.0, 1500, "blue");
        System.out.println("Car 4: " + car4.year + ", " + car4.speed + ", " + car4.weight + ", " + car4.color);
    }
}

