package course3.essential.topic01.book;

public class Author {
    private String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public void show(){
        System.out.println(authorName);
    }
}
