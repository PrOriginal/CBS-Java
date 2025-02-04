package course3.essential.topic03.printer;

public class PrinterRed extends Printer {

    void print(String value) {
        System.out.println("\u001B[31m" + value + "\u001B[0m"); // Червоний колір
    }
}
