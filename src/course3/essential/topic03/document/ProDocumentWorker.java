package course3.essential.topic03.document;

public class ProDocumentWorker extends DocumentWorker {


    @Override
    public void editDocument(){
        System.out.println("Документ відредаговано");
    }
    @Override
    public void saveDocument(){
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");
    }
}
