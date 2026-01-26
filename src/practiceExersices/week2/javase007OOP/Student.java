package practiceExersices.week2.javase006.javase007OOP;

import java.util.Arrays;

public class Student {
    public String name;
    public int id;
    public double GPA;
    public int []grades;
    //Default constructor
    public Student() {
        grades = new int[5];
    }

    public Student(String studentName, int studentId) {
        this.name = studentName;
        this.id = studentId;
        grades = new int[5];
    }

    public Student(String studentName, int studentId, int[] studentGrades) {
        this.name = studentName;
        this.id = studentId;
        this.grades = grades;
    }

    public Student(String studentName, int studentId, int[] studentGrades, double studentGpa) {
        this.name = studentName;
        this.id = studentId;
        this.grades = studentGrades;
        this.GPA = studentGpa;
    }

    public void addGrade(int index, int grade) {
        grades[index] = grade;
    }

    public double calculateGPA() {
        int totalMarks = 0;
        for (int i = 0; i < grades.length; i++) {
            totalMarks += grades[i];
        }
        GPA = (double) totalMarks / grades.length;
        return GPA;
    }

    public void printStudentInfor() {
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
        System.out.println("Grades: "+ Arrays.toString(grades));
        System.out.println("GPA: "+ calculateGPA());
        System.out.println("-------------------------");
    }
}