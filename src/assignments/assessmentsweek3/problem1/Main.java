package assignments.assessmentsweek3.problem1;

import practiceExersices.week3.day3.Library;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        LibraryItem book = new Book(1, "BOOKS", "ABEDNEGO", "2dr4", "Fantasy");
//        book.displayDetails();
//        System.out.println();
//        LibraryItem dvd = new DVD(2, "DIGITAL VERSATILE DISKS", "KAUME", 1000, 65);
//        dvd.displayDetails();
//        System.out.println();
//        LibraryItem magazine = new Magazine(3, "MAGAZINES", "CIUMBE", 12, LocalDate.of(2026, 2, 10));
//        magazine.displayDetails();

        LibraryItem[] items = {
                new Book(1, "BOOKS", "ABEDNEGO", "2dr4", "Fantasy"),
                new DVD(2, "DIGITAL VERSATILE DISKS", "KAUME", 1000, 65),
                new Magazine(3, "MAGAZINES", "CIUMBE", 12, LocalDate.of(2025, 2, 10))
        };

        for (LibraryItem item : items) {
            item.checkOut();
            item.returnItem();
            item.displayDetails();
        }
    }
}
