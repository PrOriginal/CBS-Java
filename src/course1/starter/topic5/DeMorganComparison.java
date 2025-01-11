package course1.starter.topic5;

public class DeMorganComparison {
    public static void main(String[] args) {


        final byte A = 0;
        final byte B = 1;

//        Використовуючи теорему де Моргана, перетворіть вихідний вираз A | B на еквівалентний вираз.
//        Заперечення кон'юнкції є диз'юнкцією заперечень.

        boolean claimWord = (~(A | B)) == (~A & ~B);
        byte claimNumber = (~(A | B)) == (~A & ~B) ? 1 : 0;

        System.out.println(claimWord);
        System.out.println(claimNumber);
    }
}



