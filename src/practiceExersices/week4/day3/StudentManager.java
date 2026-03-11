package practiceExersices.week4.day3;

import java.util.ArrayList;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(1, "Alice", "A"));
        studentArrayList.add(new Student(2, "Bob", "B"));
        studentArrayList.add(new Student(3, "Abednego", "A"));
        studentArrayList.add(new Student(4, "Kaume", "C"));

        System.out.println("Original List");
        for (Student student : studentArrayList) {
            System.out.println(student);
        }

        studentArrayList.remove(studentArrayList.get(0));
        System.out.println("\nList after remove");
        for (Student student : studentArrayList) {
            System.out.println(student);
        }

        System.out.println("\nStudent at index 3 is: "+ studentArrayList.get(2));


    }
}
