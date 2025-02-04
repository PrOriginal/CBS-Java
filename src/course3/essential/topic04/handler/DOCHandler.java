package course3.essential.topic04.handler;

public class DOCHandler extends AbstractHandler{

    @Override
    void open(){
        System.out.println("Opening DOC file");
    }
    @Override
    void create(){
        System.out.println("Creating DOC file");
    }
    @Override
    void change(){
        System.out.println("Changing DOC file");
    }
    @Override
    void save(){
        System.out.println("Saving DOC file");
    }
}
