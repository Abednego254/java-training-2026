package practiceExersices.week3.Day1;

public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must be filled");
        }
        this.name = name;

        if (id <= 0) {
            throw new IllegalArgumentException("id cannot be 0 or negative");
        }
        this.id = id;

        if (salary <= 0.0) {
            throw new IllegalArgumentException("Salary cannot be 0 or negative");
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateBonus();

    public void displayInfo() {
        System.out.println("Name: "+ getName());
        System.out.println("Salary: "+ getSalary());
    }

    public static void main(String[] args) {
        Manager manager = new Manager("ABEDNEGO", 1111, 150000, "ITHR");
        manager.displayInfo();
        Developer developer = new Developer("KAUME", 2, 10000, "python");
        developer.displayInfo();
    }
}
