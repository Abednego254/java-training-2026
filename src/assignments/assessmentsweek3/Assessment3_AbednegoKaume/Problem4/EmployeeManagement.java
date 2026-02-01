/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Abednego Kaume
 * Date: 01-02-2026
 * Problem: Problem 4
 * Key Features:
 * - Code analysis and debugging
 * - Proper encapsulation and access control
 * - Correct use of constructors and instance variables
 * - Exception handling for invalid salary values
 */


package assignments.assessmentsweek3.Assessment3_AbednegoKaume.Problem4;

/* The problematic code:


 */
//public class EmployeeManagement {
//
//    // ISSUE 1: Static Variable misuse
//    public static String companyName; // (i)Static variables should represent shared data but is unused (ii) It's declared but never initialized.
//    private String employeeName;
//    private double salary;
//
//
//    // Constructor lacks validation
//    public EmployeeManagement(String name) {
//        employeeName = name; // Allows null or empty employee names
//    }
//
//    // ISSUE 3: Logical error
//    public void setSalary(double salary) {
//        if (salary < 0) {
//            System.out.println("Salary cannot be negative"); // ISSUE 4: No Exception  Handling. Should throw an exception to enforce correctness
//        }
//        salary = salary;  // Here is the error, assigning a variable to itself
//    }
//
//
//    //ISSUE 5: METHOD SIGNATURE ERROR. The method is declared void and then attempts to return a value
//    public void calculateBonus() {
//        return salary * 0.1; // Compile time error right here
//    }
//}

/* ===== HERE IS AN EXPLANATION OF EVERY ERROR IDENTIFIED IN THE CODE =================
        1. STATIC MISUSE
            Static variables belong to the class, not objects.
            Declaring the field companyName without initialization or access methods makes it useless and misleading.

        2. CONSTRUCTOR PROBLEM
            Allowing invalid names results in objects existing in an invalid state, violating encapsulation and robustness.

        3. SETTER LOGIC ERROR
            Failing to use this.salary prevents updating the actual object state, rendering the setter ineffective.

        4. MISSING EXCEPTION HANDLING
            Printing an error does not stop execution. Invalid salary values should be prevented using exceptions.

        5. INVALID METHOD DECLARATION
            A method returning a value must declare a return type. This code will not compile.
 */

/*========== CORRECT IMPLEMENTATION ==================

 */

public class EmployeeManagement {
    private static String companyName = "TECH-CORP LTD";
    private String employeeName;
    private double salary;

    public EmployeeManagement(String employeeName) {
        if (employeeName == null || employeeName.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be null!");
        }

        this.employeeName = employeeName;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    /* ==========DEMONSTRATING USAGE===============

     */

    public static void main(String[] args) {
        try {
            EmployeeManagement employeeManagement = new EmployeeManagement("ABEDNEGO");
            employeeManagement.setSalary(750000);

            System.out.println("COMPANY NAME: "+ EmployeeManagement.getCompanyName());
            System.out.println("EMPLOYEE NAME: "+ employeeManagement.getEmployeeName());
            System.out.println("SALARY: "+ employeeManagement.getSalary());
            System.out.println("BONUS: "+ employeeManagement.calculateBonus());
        }
        catch (IllegalArgumentException iae) {
            System.out.println("ERROR! "+ iae.getMessage());
        }
    }
}