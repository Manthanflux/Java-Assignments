public class Book {

    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;

    public Book(String title, String author, String bookCode) {

        if (title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }

        if (author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be blank");
        }

        if (bookCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Book code cannot be blank");
        }

        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
        this.loaned = false;
    }

    public boolean borrowBook() {

        if (!loaned) {
            loaned = true;
            return true;
        }

        return false;
    }

    public boolean returnBook() {

        if (loaned) {
            loaned = false;
            return true;
        }

        return false;
    }

    public boolean isAvailable() {
        return !loaned;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public String toString() {
        return "Book Code: " + bookCode +
               ", Title: " + title +
               ", Author: " + author +
               ", Available: " + isAvailable();
    }
}