package practiceExersices.week4.day2ListsAndMaps;

import java.util.*;

public class IteratorPlusCollectonMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(001, "Abednego", 98));
        students.add(new Student(002, "Gideon", 99));
        students.add(new Student(005, "Pacific", 60));
        students.add(new Student(004, "Shiwama", 85));
        students.add(new Student(003, "Cynthia", 75));

        System.out.println("Original List: ");
        for (Student s : students) {
            System.out.println(s);
        }

        Comparator<Student> sortByMarksDescending = (s1,s2) -> s2.marks - s1.marks;
        Collections.sort(students, sortByMarksDescending);

        System.out.println("Marks sorted, Top to Bottom; ");
        for (Student s : students) {
            System.out.println(s);
        }

        Comparator<Student> sortByName = (s1, s2) -> s2.name.compareTo(s1.name);
        Collections.sort(students, sortByName);

        System.out.println("Sorted by name (A - Z");
        for (Student s : students) {
            System.out.println(s);
        }

        Comparator<Student> sortByIdAscending = (s1, s2) -> s1.id - s2.id;
        Collections.sort(students, sortByIdAscending);

        System.out.println("Sorted by ID Ascending: ");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
