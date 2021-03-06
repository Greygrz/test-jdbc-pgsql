package fr.grey.tpjdbc;

public class Book {

    private int id;
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, String author) {
        this(title,author);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" + " id= " + this.getId() + ", title= " + this.getTitle() + ", author= " + this.getAuthor() + '}';
    }
}

