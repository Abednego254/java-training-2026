package practiceExersices.javase006;

public class BasicCalculatorMethods {
    public int firstNumber;
    public int secondNumber;

    public int add(int a, int b) {
        this.firstNumber = a;
        this.secondNumber = b;
        return a + b;
    }

    public int subtract(int a, int b) {
        this.firstNumber = a;
        this.secondNumber = b;
        return a - b;
    }

    public int multipy(int a, int b) {
        firstNumber = a;
        this.secondNumber = b;
        return a * b;
    }

    public double divide(double a, double b) {
        firstNumber = (int) a;
        this.secondNumber = (int) b;
        if(secondNumber != 0){
            double divide = a / b;
        } else {
            System.out.println("Cannot divide by 0");
        }
        return a / b;
    }

    public void displayCalculations() {
        System.out.println("Addition: "+ add(5, 3));
        System.out.println("Subtraction: "+ subtract(5,3));
        System.out.println("Multiplication: "+ multipy(5, 3));
        System.out.println("Division: "+ divide(5, 3));

    }

    public static void main(String[] args) {
        BasicCalculatorMethods basicCalculatorMethods = new BasicCalculatorMethods();
        basicCalculatorMethods.displayCalculations();
    }
}
