package course1.starter.topic5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        boolean isPowerOfTwo = Integer.bitCount(number) == 1;

//        System.out.println(Integer.bitCount(number));
        System.out.println("Is the number " + number + " a power of two? " + isPowerOfTwo);
    }
}

