package assignments.assessmentsweek2;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String number, String holder, double bal) {
        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException("The Account number should be filled");
        }
        this.accountNumber = number;

        if (holder == null || holder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account Holder name should be filled!");
        }
        this.accountHolder = holder;

        if (bal < 0) {
            throw new IllegalArgumentException("The balance should not be lower than zero.");
        }
        this.balance = bal;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(" You can only deposit a positive amount.");
        } else{
            System.out.println("You have deposited "+ amount);
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(" You cannot withdraw a negative amount!");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Sorry! You do not have sufficient balance to withdraw "+ amount);
        }
        System.out.println("You have withdrawn "+ amount);
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("1111", "Kaume", 10000, 0.05);
        BankAccount checkingAccount = new CheckingAccount("Bob", "2222", 1000, 300);

        savingsAccount.withdraw(1000);

//        checkingAccount.withdraw(950);

    }
}
