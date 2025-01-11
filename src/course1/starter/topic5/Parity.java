package course1.starter.topic5;

public class Parity {
    public static void main(String[] args) {
        byte num = 110;
        System.out.println("Number: " + num);
        System.out.println("Checking parity using & operator:");
        System.out.println((num & 1) == 0);
        System.out.println("Checking parity using % operator:");
        System.out.println((num % 2) == 0);
    }
}
