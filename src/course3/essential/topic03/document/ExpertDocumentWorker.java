package course3.essential.topic03.document;

public class ExpertDocumentWorker extends ProDocumentWorker{

    @Override
    public void saveDocument(){
        System.out.println("Документ збережено у новому форматі");
    }
}
