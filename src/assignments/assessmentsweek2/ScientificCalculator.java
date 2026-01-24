package assignments.assessmentsweek2;

public class ScientificCalculator extends Calculator {

    // Here, we override the method in the super class Calculator
    @Override
    public int add(int a, int b) {
        int result = super.add(a, b);
        System.out.println("The sum of two integers: "+ result);
        return result;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
