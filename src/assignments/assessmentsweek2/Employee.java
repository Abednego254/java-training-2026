package assignments.assessmentsweek2;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("The name should be filled");
        }
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }
        this.id = id;
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
        return getSalary() * 0.05;
    }

    public void displayInfo() {
        System.out.println("NAME: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("SALARY: " + getSalary());
        System.out.println("Bonus: " + calculateBonus());
    }

    public static void main(String[] args) {
        Employee employee = new Employee("WAMBUI", 001, 25000);
        employee.displayInfo();
        System.out.println();
        Manager manager = new Manager("ABEDNEGO", 001, 150000, "IT");
        manager.displayInfo();
        System.out.println();
        Developer developer = new Developer("ANTONY", 001, 100000, "JAVA");
        developer.displayInfo();
    }
}

