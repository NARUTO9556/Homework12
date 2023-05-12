public class Book {
    private final String nameBook;
    private int publishingYear;
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public Book(String nameBook, int publishingYear) {
        this.nameBook = nameBook;
        this.publishingYear = publishingYear;
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