package assignments.assessmentsweek3.problem2;

import javax.naming.InsufficientResourcesException;
import javax.security.auth.login.AccountNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount accountOne = new BankAccount("1a2b3c4d5e678", "Abedie", 100000);
            BankAccount accountTwo = new BankAccount("1234567890123", "Abednego", 10000);

            accountTwo.deposit("1234567890123", -100);
            accountTwo.withdraw("1234567890123", 20000);
            accountTwo.transfer("1234567890123", 1000);
        } catch (AccountNotFoundException e) {
            System.out.println("Account error: "+ e.getMessage());
        } catch (InsufficientFundsException ire) {
            System.out.println("Funds error: "+ ire.getMessage());
        } catch (InvalidTransactionException ite) {
            System.out.println("Transaction error: "+ ite.getMessage());
        }finally {
            System.out.println("Transaction completed.");
        }
    }
}
