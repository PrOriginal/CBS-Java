package course1.starter.topic4;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

        System.out.println("Введіть слово для перекладу: ");

        Scanner input = new Scanner(System.in);
        String word = input.next().toLowerCase();

        switch (word) {
            case "сонячний": {
                System.out.println("Sunny ");
                break;
            }
            case "дощовий": {
                System.out.println("Rainy ");
                break;
            }
            case "хмарний": {
                System.out.println("Cloudy ");
                break;
            }
            case "вітряний": {
                System.out.println("Windy ");
                break;
            }
            case "сніжний": {
                System.out.println("Snowy ");
                break;
            }
            case "туманний": {
                System.out.println("Foggy");
                break;
            }
            case "штормовий": {
                System.out.println("Stormy ");
                break;
            }
            case "вологий": {
                System.out.println("Humid");
                break;
            }
            case "гарячий": {
                System.out.println("Hot");
                break;
            }
            case "холодний": {
                System.out.println("Cold ");
                break;
            }
            default: {
                System.out.println("Такого слова немає");
                break;
            }
        }
    }
}
