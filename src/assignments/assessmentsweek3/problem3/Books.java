package assignments.assessmentsweek3.problem3;

import assignments.assessmentsweek3.problem2.InsufficientFundsException;

public class Books extends Product {
    private String author;
    private String publisher;
    private String isbn;

    public Books(String productId, String name, double price, int stockQuantity, String author, String publisher, String isbn) throws InvalidProductException {
        super(productId, name, price, stockQuantity);

        if (author == null || author.trim().isEmpty()) {
            throw new InvalidProductException("Kindly add the missing field, author");
        }
        if (publisher == null || publisher.trim().isEmpty()) {
            throw new InvalidProductException("Kindly add the missing field, publisher");
        }
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new InvalidProductException("Kindly add the missing field, isbn");
        }

        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public double calculateDiscount() {
        double discount = 0.02 * price;
        price -= discount;
        System.out.println("You have been awarded a discount of "+ discount +"The price is now "+ price);
        return discount;
    }

    @Override
    public String getProductType() {
        return "BOOKS";
    }

    @Override
    public void applyTax() {
        super.applyTax();
        System.out.println("The price after tax: "+ price);
    }
    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("AUTHOR: "+ getAuthor());
        System.out.println("Publisher: "+ getPublisher());
        System.out.println("Isbn: "+ getIsbn());
    }

    @Override
    public void reduceStock(int quantity) throws OutOfStockException {
        super.reduceStock(quantity);
    }
}
