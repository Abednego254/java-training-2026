/**
 * Assessment 3 – Object Oriented Programming
 * Student Name: Abednego
 * Unit: Object Oriented Programming
 * Date: 2026-02-01
 *
 * Problem: Problem 2 – Exception Handling
 *
 * Description:
 * This runtime exception is used to indicate invalid
 * transactions such as negative deposits or withdrawals.
 */


package assignments.assessmentsweek3.Assessment3_AbednegoKaume.Problem2;

public class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException(String message) {
        super(message);
    }
}
