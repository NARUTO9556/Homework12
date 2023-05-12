public class Book {
    private final String nameBook;
    private int publishingYear;
    private Author author;

    public Book(String nameBook, int publishingYear, Author author) {
        this.nameBook = nameBook;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}