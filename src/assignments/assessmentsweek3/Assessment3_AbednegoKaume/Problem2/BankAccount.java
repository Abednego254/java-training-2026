/**
 * Assessment 3 – Object Oriented Programming
 * Student Name: Abednego Kaume
 * Unit: Object Oriented Programming
 * Date: 2026-02-01
 *
 * Problem: Problem 2 – Exception Handling
 *
 * Description:
 * This class represents a bank account and supports deposit,
 * withdrawal, and transfer operations with proper exception handling.
 * Custom exceptions are used to handle invalid transactions,
 * insufficient funds, and account-related errors.
 */

package assignments.assessmentsweek3.Assessment3_AbednegoKaume.Problem2;

import javax.naming.InsufficientResourcesException;
import javax.security.auth.login.AccountNotFoundException;
import java.util.Scanner;

public class BankAccount {
    Scanner scanner = new Scanner(System.in);
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        if (accountNumber == null || !accountNumber.matches("[A-Za-z0-9]{13}")) {
            throw new IllegalArgumentException("The account number should have exactly 13 characters");
        }
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Please input the missing field account holder");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(String accountToDepositTo, double amount) throws AccountNotFoundException {
            if (!accountToDepositTo.equals(accountNumber)) {
                throw new AccountNotFoundException("Account not found!");
            }
            if (amount <= 0){
                throw new IllegalArgumentException("You can only deposit a positive amount in your account");
            }
            balance += amount;
            System.out.println("Ksh. "+ amount +" successfully deposited in your account "+ accountToDepositTo +". Your current balance is "+ getBalance());
    }

    public void withdraw(String accountToWithdrawFrom, double amount) throws AccountNotFoundException, InsufficientFundsException {
        if (!accountToWithdrawFrom.equals(accountNumber)) {
             throw new AccountNotFoundException("The account is not found!");
        }
        if ( amount > balance) {
            throw new InsufficientFundsException("Insufficient balance in your account to withdraw "+ amount);
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("You can only withdraw a positive amount!");
        }

        balance -= amount;
        System.out.println("You have withdrawn "+ amount +". Your balance is "+ balance);
    }

    public void transfer(String toAccount, double amount) throws AccountNotFoundException, InsufficientFundsException, InvalidTransactionException {
        if (!toAccount.equals(accountNumber)) {
            throw new AccountNotFoundException("The account to send money to is not available: "+ toAccount);
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("You cannot transfer a negative amount!");
        }
        if (amount > balance) {
            throw new InvalidTransactionException("Insufficient funds to transfer "+ amount);
        }

        balance -= amount;
        System.out.println("You have transferred "+ amount +". Your balance is "+ getBalance());
    }
}
