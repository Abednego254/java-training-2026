/**
 * Assessment 3 – Object Oriented Programming
 * Student Name: Abednego
 * Unit: Object Oriented Programming
 * Date: 2026-02-01
 *
 * Problem: Problem 3 – Inheritance and Polymorphism
 *
 * Description:
 * This abstract class represents a generic product and
 * defines common attributes and methods shared by all
 * product types in the system.
 */


package assignments.assessmentsweek3.Assessment3_AbednegoKaume.Problem3;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity) throws InvalidProductException {
        if (productId == null || !productId.matches("[A-Za-z0-9]{5}")) {
            throw new InvalidProductException("The product id should be exactly 5 digits!");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidProductException("Kindly fill in the missing field, name os product.");
        }
        if (price <=0) {
            throw new InvalidProductException("Kindly enter a positive price of the product.");
        }
        if (stockQuantity < 0) {
            throw new InvalidProductException("Stock can only hold a positive number.");
        }

        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public abstract double calculateDiscount();
    public abstract String getProductType();

    public void reduceStock(int quantity) throws OutOfStockException {
        if (stockQuantity < quantity) {
            throw new OutOfStockException("You have insufficient stock");
        }
        stockQuantity -= quantity;
        System.out.println("Stock reduced: "+ quantity);
        System.out.println("Current Stock: "+ stockQuantity);
    }

    public void applyTax() {
        double percentageTax = 0.16 * price;
        price += percentageTax;
    }

    public void displayProductInfo() {
        System.out.println("Name of the product: "+ getName());
        System.out.println("Price of the product: "+ getPrice());
        System.out.println("Quantity in stock: "+ getStockQuantity());
    }
}
