package course1.starter.topic4;

public class Operations {
    public static void main(String[] args) {
//        ----Завдання 4----
        int a = 11;
        if (a > 0) {
            a += 1;
        }
        System.out.println("----Завдання 4----");
        System.out.println("a: " + a);

//        ----Завдання 5----
        int b = -32;
        if (b > 0) {
            b += 1;
        } else {
            b -= 2;
        }
        System.out.println("----Завдання 5----");
        System.out.println("b: " + b);

//        ----Завдання 6----
        int c = 27;
        int d = 17;
        int f = 92;
        System.out.println("----Завдання 6----");
        System.out.println("Max number is: " + Math.max(c,Math.max(d,f)));
        System.out.println("Min number is: " + Math.min(c,Math.min(d,f)));
        System.out.println("Average is: " + (c + d + f)/3);
    }
}
