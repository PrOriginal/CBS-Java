package course1.starter.topic3;

public class Volume {
    public static void main(String[] args) {

/*        V = πR2h
         S = 2πR2 + 2πR2 = 2πR(R+h)*/
        final double PI = 3.14159265359;
        int r = 10;
        int h = 13;
        double area = PI * h * r * r;
        double volume = 2 * PI * r * (r + h);
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
}
