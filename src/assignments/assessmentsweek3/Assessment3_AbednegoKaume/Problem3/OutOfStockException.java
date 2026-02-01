/**
 * Assessment 3 – Object Oriented Programming
 * Student Name: Abednego
 * Unit: Object Oriented Programming
 * Date: 2026-02-01
 *
 * Problem: Problem 3 – Inheritance and Polymorphism
 *
 * Description:
 * This custom exception is thrown when an attempt is made
 * to reduce stock beyond the available quantity.
 */


package assignments.assessmentsweek3.Assessment3_AbednegoKaume.Problem3;

public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
