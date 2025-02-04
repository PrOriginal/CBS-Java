package course3.essential.topic03.printer;

public class Printer {

    void print(String value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        Printer defaultPrinter = new Printer();
        Printer redPrinter = new PrinterRed();
        Printer yellowPrinter = new PrinterYellow();
        Printer bluePrinter = new PrinterBlue();

        defaultPrinter.print("Звичайний текст");
        redPrinter.print("Червоний текст");
        yellowPrinter.print("Жовтий текст");
        bluePrinter.print("Синій текст");
    }
}
