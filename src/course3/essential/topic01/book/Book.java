package course3.essential.topic01.book;
import java.util.Scanner;

public class Book {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter title: ");
    Title title = new Title(sc.nextLine());
    System.out.println("Enter author: ");
    Author author = new Author(sc.nextLine());
    System.out.println("Enter content of the book: ");
    Content content = new Content(sc.nextLine());

    title.show();
    author.show();
    content.show();

    }
}
