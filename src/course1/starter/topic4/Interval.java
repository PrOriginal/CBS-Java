package course1.starter.topic4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        byte n = sc.nextByte();
        if (n < 15) {
            System.out.println("Your number is in [0 - 14] range");
        } else if (n < 36) {
            System.out.println("Your number is in [15 - 35] range");
        } else if (n < 51) {
            System.out.println("Your number is in [36 - 50] range");
        } else if (n <= 100) {
            System.out.println("Your number is in [51 - 100] range");
        } else {
            System.out.println("Your number is greater than 100");
        }
    }
}
