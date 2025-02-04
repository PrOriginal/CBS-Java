package course3.essential.topic03.document;
import java.util.Scanner;

public class DocumentWorker {
//    private String key;
//
//    DocumentWorker() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Будь-ласка введіть ключ активації");
//        String key = sc.nextLine();
//        this.key = key;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();

        DocumentWorker documentWorker;

        switch (key) {
            case "pro":
                documentWorker = new ProDocumentWorker();
                break;
            case "exp":
                documentWorker = new ExpertDocumentWorker();
                break;
            default:
                documentWorker = new DocumentWorker();
        }

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();

    }

    public void openDocument(){
        System.out.println("Документ відкритий");
    }
    public void editDocument(){
        System.out.println("Правка документа доступна у версії Про");
    }
    public void saveDocument(){
        System.out.println("Збереження документа доступне у версії Про");
    }
}
