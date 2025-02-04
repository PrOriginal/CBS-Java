package course3.essential.topic03.printer;

public class PrinterYellow extends Printer {
    @Override
    void print(String value) {
        System.out.println("\u001B[33m" + value + "\u001B[0m"); // Жовтий колір
    }
}
