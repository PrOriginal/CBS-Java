package course1.starter.topic3;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type radius");
        float radius = input.nextFloat();

        final double PI = 3.14159265359;
//        float radius = 23.2f;

        double area = Math.pow(radius, 2) * PI;

        System.out.println(area);
    }
}
