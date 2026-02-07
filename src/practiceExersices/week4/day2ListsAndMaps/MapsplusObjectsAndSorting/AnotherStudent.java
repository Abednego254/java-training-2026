package practiceExersices.week4.day2ListsAndMaps.MapsplusObjectsAndSorting;

import java.util.*;

public class AnotherStudent {
    String name;
    int marks;

    public AnotherStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name +" | "+ marks;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if(this == null) return false;
        if (getClass() != object.getClass()) return false;

        AnotherStudent anotherStudent = (AnotherStudent) object;
        return this.marks == anotherStudent.marks && this.name.equals(anotherStudent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marks);
    }
    public static void main(String[] args) {
        Map<Integer, AnotherStudent> studentMap = new HashMap<>();
        studentMap.put(1, new AnotherStudent("Abednego", 99));
        studentMap.put(2, new AnotherStudent("Cynthia", 85));
        studentMap.put(3, new AnotherStudent("Kaume", 95));
        studentMap.put(4, new AnotherStudent("Abednego", 99));
        studentMap.put(5, new AnotherStudent("Monicah", 85));
        studentMap.put(6, new AnotherStudent("Ciumbe", 95));

        List<AnotherStudent> anotherStudentsList = new ArrayList<>(studentMap.values());

        Iterator<AnotherStudent> iterator = anotherStudentsList.iterator();
        while (iterator.hasNext()) {
            AnotherStudent anotherStudent = iterator.next();
            if (anotherStudent.marks < 85) {
                iterator.remove();
            }
        }
            System.out.println("\nStudents with marks greater the 85: ");
            for (AnotherStudent as : anotherStudentsList) {
                System.out.println(as);
            }

            Comparator<AnotherStudent> sortByName = (s1, s2) -> s1.name.compareTo(s2.name);
            Collections.sort(anotherStudentsList, sortByName);

            System.out.println("\nStudent list after being sorted by name (A -> Z): ");
            for (AnotherStudent an : anotherStudentsList) {
                System.out.println(an);
            }

            Set<AnotherStudent> anotherStudentSet = new HashSet<>(anotherStudentsList);
        System.out.println("\nStudent set: ");
            for (AnotherStudent as : anotherStudentSet) {
                System.out.println(as);
            }
    }
}
