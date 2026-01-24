package assignments.assessmentsweek2;

public class Calculator {
    //A method called add() with 2 parameters
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Another method called add() that has 3 parameters. This is method overloading
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        String c = a.concat(b);
        return c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10, 15);
        calculator.add(10.0, 15.0);
        calculator.add(10, 15, 7);
        calculator.add("ABEDNEGO", "KAUME");

        //The overriden method in the child class is showing here
        Calculator scientificCalculator = new ScientificCalculator();
        scientificCalculator.add(10, 15);
    }
}
