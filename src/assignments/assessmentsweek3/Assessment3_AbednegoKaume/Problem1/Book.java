/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Abednego Kaume
 * Date: 01-02-2026
 * Problem: Problem 1
 * Key Features:
 * - Inheritance and method overriding
 * - Encapsulation using private fields and public methods
 * - Polymorphism through base class references
 * - Abstract behavior implemented in subclasses
 */


package assignments.assessmentsweek3.Assessment3_AbednegoKaume.Problem1;

public class Book extends LibraryItem {
    private String  isbn;
    private String genre;

    public Book(int itemId, String title, String author, String isbn, String genre) {
        super(itemId, title, author);
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("Kindly fill the missing field, isbn");
        }
        if (genre == null || genre.trim().isEmpty()) {
            throw new IllegalArgumentException("Kindly fill the missing field, genre");
        }

        this.isbn = isbn;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void checkOut() {
        super.checkOut();
        System.out.println("You have borrowed a book successfully!");
    }

    @Override
    public void returnItem() {
        super.returnItem();
        System.out.println("You have successfully returned the borrowed book.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The library item is a book");
        System.out.println("The isbn of the book is "+ getIsbn());
        System.out.println("The book belongs to "+getGenre() +"'s genre");
        System.out.println();
    }
}
