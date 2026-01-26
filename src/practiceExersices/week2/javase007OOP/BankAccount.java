package practiceExersices.week2.javase006.javase007OOP;

public class BankAccount {
    public String accountNumber;
    public String accountHolder;
    public double balance;

    public BankAccount () {
        accountHolder = null;
        accountNumber = null;
        balance = 0.0;
    }

    public BankAccount (String number, String holder) {
        this.accountNumber = number;
        this.accountHolder = holder;
    }

    public BankAccount (String number, String holder, double balance) {
        this.accountNumber = number;
        this.accountHolder = holder;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("You have deposited "+ amount +". Your balance is "+ balance);
    }

    public void withdraw(int amount) {
        balance  -= amount;
        System.out.println("You have withdrawn "+ amount +". Your balance is "+ balance);
    }

    public void displayBalance () {
        System.out.println("Holder: "+accountHolder);
        System.out.println("Number: "+accountNumber);
        System.out.println("Balance: "+ balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountHolder = "Abednego";
        bankAccount.accountNumber = "A0123";
        bankAccount.balance = 10000.0;
        bankAccount.displayBalance();
    }

}
