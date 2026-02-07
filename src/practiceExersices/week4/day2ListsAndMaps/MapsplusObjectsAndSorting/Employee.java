package practiceExersices.week4.day2ListsAndMaps.MapsplusObjectsAndSorting;

import java.util.*;

public class Employee {
    int id;
    String name;
    int performanceScore;

    public Employee(int id, String name, int performanceScore) throws IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("Id should always be positive!");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        if (performanceScore <= 0) {
            throw new IllegalArgumentException("Performance score cannot be empty!");
        }

        this.id = id;
        this.name = name;
        this.performanceScore = performanceScore;
    }

    @Override
    public String toString() {
        return id +" | "+ name +" | "+ performanceScore;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (getClass() != object.getClass()) return false;

        Employee employee =(Employee) object;
        return id == employee.id && Objects.equals(name, employee.name) && performanceScore == employee.performanceScore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, performanceScore);
    }

    public static void main(String[] args) {
        try {
            Map<Integer, Employee> employeeMap = new HashMap<>();
            employeeMap.put(1, new Employee(101, "Abednego", 65));
            employeeMap.put(2, new Employee(102, "Abednego", 65));
            employeeMap.put(3, new Employee(103, "Kaume", 75));
            employeeMap.put(4, new Employee(104, "Ciumbe", 89));
            employeeMap.put(5, new Employee(105, "Cynthia", 56));
            employeeMap.put(6, new Employee(106, "Kaume", 75));

            List<Employee> employees = new ArrayList<>(employeeMap.values());

            Iterator<Employee> iterator = employees.iterator();
            while (iterator.hasNext()) {
                Employee employee = iterator.next();
                if (employee.performanceScore < 60) {
                    iterator.remove();
                }
            }

            System.out.println("\nEmployees with performance score greater the 60: ");
            for (Employee employee : employees) {
                System.out.println(employee);
            }

            Comparator<Employee> sortPerformanceScoreDesc = (s1, s2) -> s2.performanceScore - s1.performanceScore;
            Collections.sort(employees, sortPerformanceScoreDesc);

            System.out.println("\nSorted employees by performance score descending: ");
            for (Employee employee : employees) {
                System.out.println(employee);
            }

            Set<Employee> employeeSet = new HashSet<>(employees);
            System.out.println("\n Final Employees set: ");
            for (Employee employee : employeeSet) {
                System.out.println(employee);
            }
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException(iae.getMessage());
        }
    }
}
