package practiceExersices.week3.day3;

import java.util.Scanner;

public class Library {
    private String nameOfBook;
    private String locationOfBook;
    public static int numberOfBooks = 0;
//    public static String[] bookNames;
    public static int numberOfMembers;

    public Library(String name, String location) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("You should fill the book's name here!");
        }
        if (location == null || location.trim().isEmpty()) {
            throw new IllegalArgumentException("You should fill the book's location here!");
        }

        this.nameOfBook = name;
        this.locationOfBook = location;
        numberOfBooks ++;
        numberOfMembers ++;
    }

    public String getName() {
        return nameOfBook;
    }

    public void setName(String name) {
        this.nameOfBook = name;
    }

    public String getLocation() {
        return locationOfBook;
    }

    public void setLocation(String location) {
        this.locationOfBook = location;
    }

    public static int getNumberOfBooks() {
        return numberOfBooks;
    }

    public static void setNumberOfBooks(int numberOfBooks) {
        Library.numberOfBooks = numberOfBooks;
    }

    static class Book {
        private String isbn;
        private String title;
        private String author;
        private boolean isAvailable;

        public Book(String isbn, String title, String author, boolean isAvailable) {
            if (isbn == null || isbn.trim().isEmpty()) {
                throw new IllegalArgumentException("You should fill the book's isbn here!");
            }
            if (title == null || title.trim().isEmpty()) {
                throw new IllegalArgumentException("You should fill the book's title here!");
            }
            if (author == null || author.trim().isEmpty()) {
                throw new IllegalArgumentException("You should fill the book's author here!");
            }

            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.isAvailable = true;
        }
    }

    class LibraryMember {
        private int memberId;
        private String name;
        private int borrowedBooks = 0;

        public LibraryMember(int memberId, String name, int borrowedBooks) {
            if (memberId <= 0) {
                throw new IllegalArgumentException("You should fill the member id!");
            }
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("You should fill name here!");
            }
            if (borrowedBooks < 0) {
                throw new IllegalArgumentException("You either have borrowed a book or have not. You cannot have a negative number of books borrowed");
            }

            this.memberId = memberId;
            this.name = name;
            borrowedBooks ++;
        }
    }

    public void addBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the book to add: "+ getName());
        String name = scanner.nextLine();
//        System.out.print("Enter the book's isbn: ");
//        String isbn = scanner.nextLine();
//        System.out.print("Enter the book's title: ");
//        String title = scanner.nextLine();
        numberOfBooks ++;
        System.out.println("Book "+ name +" added successfully");
        System.out.println("The total number of books are now "+ getNumberOfBooks());
    }

    public void registerMembers(int memberId, String name, int borrowedBooks) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String memberName = scanner.nextLine();
        memberName = name;
        LibraryMember libraryMember = new LibraryMember(memberId, memberName, borrowedBooks);
        

    }
}
