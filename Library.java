class Book {
    private String name;
    private int bookId;
    private Author author;

    public Book(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthorName() {
        return author.getAuthorName();
    }

    public void setAuthorName(String authorName) {
        author.setAuthorName(authorName);
    }
}

class Author {
    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}

public class Library {

    public static void main(String[] args) {
        Author a1 = new Author();
        Author a2 = new Author();

        Book b1 = new Book(a1);
        Book b2 = new Book(a2);

        System.out.println("--Book1--");

        b1.setName("Twisted Lies");
        b1.setBookId(1);
        b1.setAuthorName("Ana Huang");

        System.out.println(" ");

        System.out.println(b1.getName());
        System.out.println(b1.getBookId());
        System.out.println(b1.getAuthorName());

        System.out.println("--Book2--");

        b2.setName("The Deal");
        b2.setBookId(2);
        b2.setAuthorName("Elle Kennedy");

        System.out.println(b2.getName());
        System.out.println(b2.getBookId());
        System.out.println(b2.getAuthorName());
    }
}
