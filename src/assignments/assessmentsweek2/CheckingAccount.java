package assignments.assessmentsweek2;

public class CheckingAccount extends BankAccount{
    private double overDraft;

    public CheckingAccount(String holder, String number, double bal, double overDraft) {
        super(number, holder, bal);
        if (overDraft < 0  ) {
            throw new IllegalArgumentException("You cannot borrow nothing.");
        }
        this.overDraft = overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > (getBalance()) + getOverDraft()) {
            throw new IllegalArgumentException("Your overdraft limit is 300");
        }
        super.withdraw(amount);
    }
}
