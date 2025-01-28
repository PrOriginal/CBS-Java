package course3.essential.topic02;

public class Car {
    public int year;
    public String color;

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Car(int year) {
        this.year = year;
        this.color = "black";
    }

    public Car() {
        this.year = 0;
        this.color = "black";
    }

    public static void main(String[] args) {
        Car defaultCar = new Car();
        System.out.println(defaultCar.year);
        System.out.println(defaultCar.color);
        Car car1 = new Car(1991);
        System.out.println(car1.year);
        System.out.println(car1.color);
        Car car2 = new Car(1990, "red");
        System.out.println(car2.year);
        System.out.println(car2.color);
    }
}
