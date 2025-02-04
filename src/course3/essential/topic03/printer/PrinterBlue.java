package course3.essential.topic03.printer;

public class PrinterBlue extends Printer {
    @Override
    void print(String value) {
        System.out.println("\u001B[34m" + value + "\u001B[0m"); // Синій колір
    }
}
