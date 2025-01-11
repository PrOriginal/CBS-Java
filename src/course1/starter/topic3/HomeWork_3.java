package course1.starter.topic3;

public class HomeWork_3 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;

        x += y - x++ * z + x;
//      10 + 12-(10 * 3) + 11 = 3
        System.out.println("Операція 1:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        z = --x - y * 5;
//           -9 - 12 * 5 = -69
        System.out.println("Операція 2:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        y /= x + 5 % z;
        System.out.println("Операція 3:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        z = x++ + y * 5;
        System.out.println("Операція 4:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        x = y - x++ * z;
        System.out.println("Операція 5:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
