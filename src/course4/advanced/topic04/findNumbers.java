package course4.advanced.topic04;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class findNumbers {

    public static String text ="Перевірка, чи містить рядок лише літери";
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(text);

        if (m.find()) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

}
