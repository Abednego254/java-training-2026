package assignments.assessmentsweek3.problem1;

public class DVD extends LibraryItem {
    private double durationInSeconds;
    private double ratingInPercentage;

    public DVD(int itemId, String title, String author, double durationInSeconds, double ratingInPercentage) {
        super(itemId, title, author);
        if (durationInSeconds <= 600.0) {
            throw new IllegalArgumentException("DVD's have a minimum duration of 10 minutes.");
        }
        if (ratingInPercentage <= 0 || ratingInPercentage > 100) {
            throw new IllegalArgumentException("Rating lies between 0 and 100%");
        }

        this.durationInSeconds = durationInSeconds;
        this.ratingInPercentage = ratingInPercentage;
    }

    public double getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(double durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public double getRatingInPercentage() {
        return ratingInPercentage;
    }

    public void setRatingInPercentage(double ratingInPercentage) {
        this.ratingInPercentage = ratingInPercentage;
    }

    @Override
    public void checkOut() {
        super.checkOut();
        System.out.println("You have successfully borrowed the DVD");
    }

    @Override
    public void returnItem () {
        super.returnItem();
        System.out.println("You have successfully returned the borrowed DVD.");
    }

    @Override
    public void displayDetails () {
        super.displayDetails();
        System.out.println("The duration of the DVD is "+ getDurationInSeconds() +" seconds");
        System.out.println("The rating of this DVD is "+ getRatingInPercentage() +"%");
        System.out.println();
    }
}
