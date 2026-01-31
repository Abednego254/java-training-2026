package assignments.assessmentsweek3.problem1;

import java.time.LocalDate;

public class Magazine extends LibraryItem {
    private int issueNumber;
    private LocalDate publicationDate;

    public Magazine(int itemId, String title, String author, int issueNumber, LocalDate publicationDate) {
        super(itemId, title, author);

        if (issueNumber <= 0) {
            throw new IllegalArgumentException("Kindly fill the missing field , issue number. (Sould be positive) ");
        }
        if (publicationDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("This magazine is not yet published!");
        }

        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public void checkOut() {
        super.checkOut();
        System.out.println("You have successfully borrowed a magazine.");
    }

    @Override
    public void returnItem() {
        super.returnItem();
        System.out.println("You have returned the borrowed Magazine");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The library item is a Magazine");
        System.out.println("The issue number is "+ getIssueNumber());
        System.out.println("The publication date is "+ getPublicationDate());
    }
}
