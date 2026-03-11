package practiceExersices.week4.day3;

import java.util.Objects;

public class Student {
    int id;
    String name;
    String grade;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id +" | "+ name +" | "+ grade;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;

        Student student = (Student) object;

        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
