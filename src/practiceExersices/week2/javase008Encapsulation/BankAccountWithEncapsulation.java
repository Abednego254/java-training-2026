package practiceExersices.week2.javase006.javase008Encapsulation;

public class BankAccountWithEncapsulation {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public String getAccountHolder() { return accountHolder; }
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder.trim();
    }

    public void setAccountNumber(String accountNumber) {
       this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Holder: "+ getAccountHolder());
        System.out.println("Number: "+ getAccountNumber());
        System.out.println("Balance: "+ getBalance());
    }

    //Decided to throw exception to avoid objects being created even if conditions re false
    public BankAccountWithEncapsulation(String holder, String number, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        if (holder == null || holder.trim().length() < 2) {
            throw new IllegalArgumentException("Account name should be present.");
        }
        if (number == null || !number.matches("[A-Za-z0-9]{10}")) {
            throw new IllegalArgumentException("Account number should be exactly 10 digits");
        }

        this.accountHolder = holder.trim();
        this.accountNumber = number;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccountWithEncapsulation bankAccountWithEncapsulation= new BankAccountWithEncapsulation("Abednego", "1234567890", 10000);
        bankAccountWithEncapsulation.displayInfo();
    }
}
