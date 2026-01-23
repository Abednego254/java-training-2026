package practiceExersices.javase008;

public class StudentWithEncapsulation {
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    public StudentWithEncapsulation(String studentId, String name, int age, double gpa) {
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setGpa(gpa);
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setStudentId(String studentId) {
        if (studentId != null && studentId.matches("[A-Za-z0-9]{6}")) {
            this.studentId = studentId;
        } else {
            System.out.println("Error! Student Id must be exactly 6 characters.");
        }
    }

    public void setName(String name) {
        if (name != null && name.trim().length() >= 2) {
            this.name = name.trim();
        } else {
            System.out.println("Error! Name should be atleast 2 characters.");
        }
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Age must be between 16 and 100 years");
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Error! GPA should be between 0 and 4.");
        }
    }

    public void displayInfo() {
        System.out.println("Student ID: "+ getStudentId());
        System.out.println("Name: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("GPA: "+ getGpa());
    }

    public static void main(String[] args) {
        StudentWithEncapsulation swe = new StudentWithEncapsulation("A1B2C3", "ABEDNEGO", 20, 4);
        swe.displayInfo();
    }
}