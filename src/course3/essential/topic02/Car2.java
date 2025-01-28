package course3.essential.topic02;

public class Car2 {
    public int year;
    public double speed;
    public int weight;
    public String color;

    // Конструктор за замовчуванням
    public Car2() {
        this(0, 0.0, 0, "undefined"); // викликаємо конструктор з 4 параметрами
    }

    // Конструктор з 1 параметром
    public Car2(int year) {
        this(year, 0.0, 0, "undefined"); // викликаємо конструктор з 4 параметрами
    }

    // Конструктор з 2 параметрами
    public Car2(int year, double speed) {
        this(year, speed, 0, "undefined"); // викликаємо конструктор з 4 параметрами
    }

    // Конструктор з 3 параметрами
    public Car2(int year, double speed, int weight) {
        this(year, speed, weight, "undefined"); // викликаємо конструктор з 4 параметрами
    }

    // Конструктор з 4 параметрами
    public Car2(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {
        // Використання конструктора за замовчуванням
        Car2 defaultCar = new Car2();
        System.out.println("Default car: " + defaultCar.year + ", " + defaultCar.speed + ", " + defaultCar.weight + ", " + defaultCar.color);

        // Використання конструктора з 1 параметром
        Car2 car1 = new Car2(1990);
        System.out.println("Car 1: " + car1.year + ", " + car1.speed + ", " + car1.weight + ", " + car1.color);

        // Використання конструктора з 2 параметрами
        Car2 car2 = new Car2(1991, 120.5);
        System.out.println("Car 2: " + car2.year + ", " + car2.speed + ", " + car2.weight + ", " + car2.color);

        // Використання конструктора з 3 параметрами
        Car2 car3 = new Car2(2000, 150.0, 1200);
        System.out.println("Car 3: " + car3.year + ", " + car3.speed + ", " + car3.weight + ", " + car3.color);

        // Використання конструктора з 4 параметрами
        Car2 car4 = new Car2(2025, 180.0, 1500, "blue");
        System.out.println("Car 4: " + car4.year + ", " + car4.speed + ", " + car4.weight + ", " + car4.color);
    }
}
