package week3.day2;

public class BankAccount {
    private static int totalAccounts = 0;
    private static final String COMPANY_NAME = "FINE BANK";
    private static double rate;

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Account number should be filled.");
        }
        this.accountNumber = accountNumber;
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Holder name should be filled!");
        }
        this.accountHolder = accountHolder;

        if (balance <= 0) {
            throw new IllegalArgumentException("Balance should be more than 0");
        }
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
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

    public static void setInterestRate(double rate) {
        if (rate <= 0) {
            throw new IllegalArgumentException("Rate should be positive");
        }
        BankAccount.rate = rate;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("You can only deposit a positive amount");
        }
        balance += amount;
        System.out.println("Amount deposited is "+amount +". The new balance is "+ balance);
//        return amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("You can only withdraw what is in your account!");
        }
        balance -= amount;
    }

    public void applyDiscount() {
        if (getBalance() <= 0) {
            throw new IllegalStateException("You cannot apply interest in a negative balance");
        } else {
            double interest = balance * rate;
            balance += interest;
        }
    }

    public static void main(String[] args) {
        BankAccount.setInterestRate(0.5);

        BankAccount bankAccount = new BankAccount(1, "ABEDIE", 1000);
        bankAccount.applyDiscount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);

        System.out.println(BankAccount.COMPANY_NAME);
        System.out.println("Total Accounts: "+ BankAccount.getTotalAccounts());
        System.out.println("Hello "+ bankAccount.accountHolder +". Here are your account details: ");
        System.out.println("Account Number: "+ bankAccount.getAccountNumber());
        System.out.println("Your balance before interest is "+ bankAccount.balance);
        bankAccount.applyDiscount();
        System.out.println("Your balance after applying interest is Balance: "+ bankAccount.balance);

    }
}
