package course1.starter.topic4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        byte operand1 = 11;
        byte operand2 = 0;
        System.out.println("1st operand: " + operand1 +", 2nd operand: " + operand2);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sign: ");
        char sign = input.next().charAt(0);

        switch (sign) {
            case '+':
                System.out.println(operand1 + operand2);
                break;
            case '-':
                System.out.println(operand1 - operand2);
                break;
            case '*':
                System.out.println(operand1 * operand2);
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Error: Cannot divide by zero");
                    break;
                }
                System.out.println(operand1 / operand2);
                break;
            default:
                System.out.println("Invalid sign: " + sign);
                break;
        }
    }
}
