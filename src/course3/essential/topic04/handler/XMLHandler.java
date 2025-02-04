package course3.essential.topic04.handler;

public class XMLHandler extends AbstractHandler {
    @Override
    void open(){
        System.out.println("Opening XML file");
    }
    @Override
    void create(){
        System.out.println("Creating XML file");
    }
    @Override
    void change(){
        System.out.println("Changing XML file");
    }
    @Override
    void save(){
        System.out.println("Saving XML file");
    }
}
