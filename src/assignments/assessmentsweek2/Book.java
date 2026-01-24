package assignments.assessmentsweek2;

import java.time.LocalDate;

public class Book {
    private String title;
    private String isbn;
    private String author;
    private double price;
    private boolean isAvailable = true;
    private LocalDate dueDate;

    public Book(String isbn, String title, String author, double price, LocalDate dueDate){
        setIsbn(isbn);
        setAuthor(author);
        setTitle(title);
        setPrice(price);
        setDueDate(dueDate);

    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return  author; }
    public double getPrice() { return price; }
    public LocalDate getDueDate() { return dueDate; }

    public void setIsbn(String isbn) {
        if (isbn == null || !isbn.matches("\\d{13}")) {
            throw new IllegalArgumentException("ISBN should have an exact 13 digits");
        } else {
            this.isbn = isbn;
        }
    }
    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("The author name should be filled.");
        } else {
            this.author = author;
        }
    }
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("The title name should be filled.");
        } else {
            this.title = title;
        }
    }
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        } else {
            this.price = price;
        }
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void borrowBook() {
        if (isAvailable) {
            System.out.println("============Details of book borrowed==========");
            System.out.println("TITLE: " + getTitle());
            System.out.println("AUTHOR: " + getAuthor());
            System.out.println("ISBN: " + getIsbn());
            System.out.println("PRICE: " + getPrice());
            System.out.println();
            isAvailable = false;
            setDueDate(LocalDate.now().plusDays(7));
        } else {
            System.out.println("The book is unavailable right now!");
        }
    }

    public boolean isOverdue() {
        boolean isOverdue = false;
        LocalDate currentDate = LocalDate.now();
        if (currentDate.isAfter(getDueDate())) {
            isOverdue = true;
        }
        return isOverdue;
    }

    public void returnBook() {
        isAvailable = true;
        if (isOverdue()) {
            System.out.println("You are late. Refer to the librarian for charges");
        } else {
            System.out.println("You are on time. Feel free to borrow another book");
        }
    }

    @Override
    public String toString() {

        return "TITLE: "+ title +
                "\nAUTHOR:"+ author +
                "\nISBN: "+ isbn +
                "\nPRICE: "+ price +
                "\nAVAILABLE: "+ isAvailable;
    }

    public static void main(String[] args) {
        new Book("1234567890123", "The Merchant of Venice", "Shakespear", 1000, LocalDate.of(2020, 2, 1)).borrowBook();
        new Book("1234567890123", "The Merchant of Venice", "Shakespear", 1000, LocalDate.of(2026, 2, 1)).returnBook();
    }

}
