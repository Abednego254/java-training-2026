package practiceExersices.javase008;

import java.time.LocalDate;

public class Book {
    private final String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private LocalDate dueDate;

    public Book(String isbn, String title, String author, LocalDate dueDate) {
        if (isbn == null || !isbn.matches("\\d{13}")) throw new IllegalArgumentException("isbn cannot be null");
        if (title == null || title.trim().isEmpty()) throw new IllegalArgumentException("Title cannot be empty");
        if (author == null || author.trim().isEmpty()) throw new IllegalArgumentException("Author cannot be absent");

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.dueDate = dueDate;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public  boolean getIsAvailable() { return isAvailable; }
    public LocalDate getDueDate() { return dueDate; }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void borrowBook() {
        if (isAvailable) {
            System.out.println("======Details of the borrowed book==========");
            System.out.println("ISBN: "+ getIsbn());
            System.out.println("TITLE: "+ getTitle());
            System.out.println("AUTHOR: "+ getAuthor());
            System.out.println("DUE DATE: "+ getDueDate());
            System.out.println("Book borrowed successfully!");
            isAvailable = false;
            setDueDate(LocalDate.of(2026, 1, 26));
        } else {
            System.out.println("Sorry! The book is unavailable right now. Please come later.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        if (isOverDue()) {
            System.out.println("You are late!");
        } else{
            System.out.println("GOOD");
        }
    }

    public boolean isOverDue() {
        boolean isOverDue = false;
        LocalDate currentDate = LocalDate.now();
        if (currentDate.isAfter(dueDate)) {
            isOverDue = true;
        }
        return isOverDue;
    }

    public static void main(String[] args) {
        Book book = new Book("1234567890123", "VUMBA", "Hassan Mwana wa Ali", LocalDate.of(2026, 2, 1));
        book.borrowBook();
        book.returnBook();
    }
}
