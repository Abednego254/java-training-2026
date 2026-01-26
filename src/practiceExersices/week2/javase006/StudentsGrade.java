package practiceExersices.week2.javase006;

import java.util.Arrays;

public class StudentsGrade {

    public static int[] grades = {85, 92, 78, 90};
    public int score = 0;
    public double marks;

    public double calculateAverage(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            score += grades[i];
        }

        return (double) score / grades.length;

    }

    public int findHighestGrade(int[] grades) {
        int highestGrade = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
            }
        }
        return highestGrade;
    }

    public int findLowestGrade(int[] grades) {
        int lowestGrade = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
            }
        }
        return lowestGrade;
    }

    public char getGradeLetter(double marks) {
        marks = score / grades.length;

        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';

    }

    public void printGradeReport(String name, int[] grades) {
        System.out.println("Student: " + name);
        System.out.println("Grades: " + Arrays.toString(grades));
        System.out.println("Average: " + calculateAverage(grades) + " (" + getGradeLetter(marks)+ ")");
        System.out.println("Highest: " + findHighestGrade(grades) + ", Lowest: " + findLowestGrade(grades));

    }

    public static void main(String[] args) {
        StudentsGrade studentsGrade = new StudentsGrade();
        studentsGrade.printGradeReport("John Doe" , grades);
    }
}