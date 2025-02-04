package course3.essential.topic04.handler;

public class Main {
    public static void main(String[] args) {
        AbstractHandler abstractHandler = new XMLHandler();
        AbstractHandler abstractHandler2 = new TXTHandler();
        AbstractHandler abstractHandler3 = new DOCHandler();

        abstractHandler.open();
        abstractHandler2.open();
        abstractHandler3.open();

        abstractHandler.create();
        abstractHandler2.create();
        abstractHandler3.create();

        abstractHandler.change();
        abstractHandler2.change();
        abstractHandler3.change();

        abstractHandler.save();
        abstractHandler2.save();
        abstractHandler3.save();
    }
}
