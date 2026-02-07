package practiceExersices.week4.day2ListsAndMaps.MapsplusObjectsAndSorting;

import java.util.*;

public class Student {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id +" | "+ name +" | "+ marks;
    }

    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student(1, "Abednego", 99));
        studentMap.put(2, new Student(2, "Cynthia", 85));
        studentMap.put(3, new Student(3, "Kaume", 95));
        studentMap.put(4, new Student(4, "Malcolm", 97));
        studentMap.put(5, new Student(5, "Monicah", 80));

        List<Student> studentList = new ArrayList<>(studentMap.values());

        System.out.println("The list from the map: ");
        for (Map.Entry<Integer, Student> students : studentMap.entrySet())  {
            System.out.println(students.getKey() +" | "+ students.getValue()  );
        }

        Comparator<Student> sortMarksByDesc = (s1, s2) -> s2.marks - s1.marks;
        studentList.sort(sortMarksByDesc);

        System.out.println("Students sorted by marks (High -> Low): ");
        for (Student s : studentList) {
            System.out.println(s);
        }

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if(student.marks < 85) {
                iterator.remove();
            }
        }

        System.out.println(studentList);
    }
}
