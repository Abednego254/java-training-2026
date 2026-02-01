/**
 * Assessment 3 – Object Oriented Programming
 * Student Name: Abednego
 * Unit: Object Oriented Programming
 * Date: 2026-02-01
 *
 * Problem: Problem 2 – Exception Handling
 *
 * Description:
 * This custom checked exception is thrown when an account
 * does not have sufficient balance to complete a transaction.
 */



package assignments.assessmentsweek3.Assessment3_AbednegoKaume.Problem2;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
