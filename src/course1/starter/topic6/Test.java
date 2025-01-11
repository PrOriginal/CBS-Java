package course1.starter.topic6;

public class Test {
    public static void main(String[] args) {


        long time1 = System.nanoTime();
        double num1 = 100000000 * Math.pow(2, 10);
        long time2 = System.nanoTime();
        System.out.println("Math.pow " + (time2 - time1));

        long time3 = System.nanoTime();
        double num2 = 100000000 << 10;
        long time4 = System.nanoTime();
        System.out.println("Shift " + (time4 - time3));


        long time5 = System.nanoTime();
        double num3 = 100000000 * 1024;
        long time6 = System.nanoTime();
        System.out.println("Multi " + (time6 - time5));

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


    }
}
