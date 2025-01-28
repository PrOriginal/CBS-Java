package course3.essential.topic02;
import java.util.Scanner;

public class MyArea {
    // Оголошення статичної константи PI
    private static final double PI = 3.14;

    // Статичний метод для обчислення площі кола
    public static double areaOfCircle(double radius){
        return PI * radius * radius;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        // Викликаємо статичний метод без створення об'єкта класу
        System.out.println("The area of the circle is " + areaOfCircle(radius));
    }
}
