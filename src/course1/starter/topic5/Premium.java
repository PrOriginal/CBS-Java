package course1.starter.topic5;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {

        long salary;
        byte experience;
        double bonus;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        salary = sc.nextLong();

        System.out.print("Enter years of experience: ");
        experience = sc.nextByte();

        if (experience < 5) {
           bonus = salary * 0.1;
        } else if (experience >= 5 && experience < 10) {
           bonus = salary * 0.15;
        } else if (experience >= 10 && experience < 15) {
           bonus = salary * 0.25;
        } else if (experience >= 15 && experience < 20) {
           bonus = salary * 0.35;
        } else if (experience >= 20 && experience < 25) {
           bonus = salary * 0.45;
        } else {
           bonus = salary * 0.5;
        }
        System.out.println("Your bonus is: " + bonus);

        /*if (experience < 5) {
            bonus = salary * 0.1;
        } else if (experience < 10) {
            bonus = salary * 0.15;
        } else if (experience < 15) {
            bonus = salary * 0.25;
        } else if (experience < 20) {
            bonus = salary * 0.35;
        } else if (experience < 25) {
            bonus = salary * 0.45;
        } else {
            bonus = salary * 0.5;
        }
        System.out.println("Your bonus is: " + bonus);*/
    }
}
