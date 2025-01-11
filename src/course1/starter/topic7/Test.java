package course1.starter.topic7;

public class Test {
    public static void main(String[] args) {

        int num = 12345;
        int sum = 0;
        while (num>0){
            int temp = num%10;
            sum+=temp;
            num/=10;
        }
        System.out.println(sum);
        System.out.println(num);


    }

}
