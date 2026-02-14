package practices.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Student {
    private String name;
    private int grade;
    private String major;

    public Student(String name, int grade, String major) {
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " ("+ grade +" , "+ major +")";
    }

    public static void main(String[] args) {
        // Supplier
        Supplier<List<Student>> studentSupplier = () -> Arrays.asList(
                new Student("Alice", 85, "CS"),
                new Student("Bob", 92, "MATH"),
                new Student("Diana", 88, "Physics"),
                new Student("Eve", 95, "Math")
        );

        List<Student> studentList = studentSupplier.get();
        System.out.println(studentList);

        // Predicate
        Predicate<Student> isCs = student -> student.getMajor().equals("CS");
        Predicate<Student> isHighScore = student -> student.getGrade() == 90;
        Predicate<Student> gradesBetween80And90 = student -> student.getGrade() >= 80 && student.getGrade() <= 90;

        // Function
        Function<Student, String> nameExtractor = Student::getName;
        Function<Student, Integer> gradeExtractor = Student::getGrade;
       // BiFunction<Student, >

        // Consumer
        Consumer<Student> printer = System.out::println;
        Consumer<Utility> printerOne = Utility::print;


        System.out.println("=====ALL STUDENTS=====");
        studentList.forEach(printer);

        System.out.println("=====Students taking Computer Science=====");
        studentList.stream()
                .filter(isCs)
                .forEach(printer);

        System.out.println("==========Excellent Students===========");
        studentList.stream()
                .filter(isHighScore)
                .forEach(printer);

        System.out.println("==========Student Names=============");
        studentList.stream().map(nameExtractor).forEach(System.out::println);
        System.out.println("=========Student Grades");
        studentList.stream().map(gradeExtractor).forEach(System.out::println);

        System.out.println("======Student's grade sorted (Descending Order)");
        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getGrade(), s1.getGrade()))
                .forEach(printer);

        System.out.println("============Students with Grades between 80 and 90");
        studentList.stream()
                .filter(gradesBetween80And90)
                .forEach(printer);
    }
}
