package assignments.assessmentsweek2;

public class SavingsAccount extends BankAccount {
    private double interest;

    public SavingsAccount(String number, String holder, double bal, double interest) {
        super(number, holder, bal);
        if (interest <= 0.0) {
            throw new IllegalArgumentException("Interest should always be positive!");
        }
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public void withdraw(double amount) {
        double bal = getBalance();
        if (amount > (bal - 100)) {
            throw new IllegalArgumentException("You must have a minimum balance of 100");
        }
        super.withdraw(amount);

    }

    public void applyInterest() {
        double results = getInterest() * getBalance();
        System.out.println(" The interest earned is "+ results);
    }
}
