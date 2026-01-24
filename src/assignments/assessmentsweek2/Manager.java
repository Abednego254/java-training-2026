package assignments.assessmentsweek2;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.trim().isEmpty()) {
            throw new IllegalArgumentException("Department cnnot be empty");
        }
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("DEPARTMENT: " + getDepartment());
    }
}
