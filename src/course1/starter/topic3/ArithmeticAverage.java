package course1.starter.topic3;

import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        double num1, num2, num3;
        double average = 0.0;

        System.out.println("Type 1st number");
        average += input.nextDouble();

        System.out.println("Type 2nd number");
        average += input.nextDouble();

        System.out.println("Type 3rd number");
        average += input.nextDouble();

        System.out.println("Average: " + average/3);
    }
}
