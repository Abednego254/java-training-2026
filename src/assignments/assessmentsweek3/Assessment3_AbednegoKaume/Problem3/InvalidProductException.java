/**
 * Assessment 3 – Object Oriented Programming
 * Student Name: Abednego
 * Unit: Object Oriented Programming
 * Date: 2026-02-01
 *
 * Problem: Problem 3 – Inheritance and Polymorphism
 *
 * Description:
 * This custom exception is thrown when invalid product
 * details are provided during product creation.
 */


package assignments.assessmentsweek3.Assessment3_AbednegoKaume.Problem3;

public class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }
}
