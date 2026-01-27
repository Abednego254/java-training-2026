package practiceExersices.week3.Day1;

public class Manager extends Employee {
    private String department;
    private double bonus;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);

        if (department == null || !department.matches("[A-Za-z]{4}")) {
            throw new IllegalArgumentException("Department should have exactly 4 characters");
        }
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculateBonus() {
        if (getSalary() <= 0) {
            throw new IllegalArgumentException("Salary is invalid. Cannot calculate bonus!");
        }
        double bon = 0.15 * getSalary();
        setBonus(bon);
        return bon;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: "+ getDepartment());
        System.out.println("Bonus: "+ calculateBonus());
    }
}
