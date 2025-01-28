package course3.essential.topic01;
import java.util.Scanner;
//Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас із ім'ям Rectangle.
//У тілі класу створити два поля, що описують довжини сторін double side1, double side2.
//Створити два методи, що обчислюють площу прямокутника - double areaCalculator (double side1, double side2) і периметр прямокутника - double perimeterCalculator (double side1, double side2).
//Написати програму, яка приймає від користувача довжини двох сторін прямокутника і виводить на екран периметр та площу.

public class Rectangle {
    private double side1, side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    };
    public double areaCalculator(double side1, double side2) {
        return side1*side2;
    };
    public double perimeterCalculator(double side1, double side2) {
        return side1+side2;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side 1: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter side 2: ");
        double side2 = sc.nextDouble();

        Rectangle rectangle = new Rectangle(side1, side2);

        System.out.println("Area of the rectangle: " + rectangle.areaCalculator(side1, side2));
        System.out.println("Perimeter: " + rectangle.perimeterCalculator(side1, side2));
    }
}
