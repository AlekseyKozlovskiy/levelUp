package lvlUp6.third;

import java.util.Objects;

public class Book {
    private String authorName;
    private String bookName;
    private Boolean issued;

    public Book(String authorName, String bookName) {
        this.authorName = authorName;
        this.bookName = bookName;
        issued = false;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Boolean getIssued() {
        return issued;
    }

    public void setIssued(Boolean issued) {
        this.issued = issued;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", book='" + bookName + '\'' +
                ", issued=" + issued +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book1 = (Book) o;
        return Objects.equals(authorName, book1.authorName) && Objects.equals(bookName, book1.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName);
    }
}
