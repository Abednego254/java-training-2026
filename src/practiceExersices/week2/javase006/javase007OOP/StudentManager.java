package practiceExersices.javase007OOP;

public class StudentManager {
    public static void main(String[] args) {
        Student[] student = new Student[3];

        student[0] = new Student("ABEDNEGO", 001);
        student[1] = new Student("KAUME", 002);
        student[2] = new Student("MONICAH", 003);

        student[0].addGrade(0, 85);
        student[0].addGrade(1, 92);
        student[0].addGrade(2, 78);
        student[0].addGrade(3, 90);
        student[0].addGrade(4, 88);

        student[1].addGrade(0, 75);
        student[1].addGrade(1, 80);
        student[1].addGrade(2, 68);
        student[1].addGrade(3, 72);
        student[1].addGrade(4, 75);

        student[2].addGrade(0, 90);
        student[2].addGrade(1, 95);
        student[2].addGrade(2, 88);
        student[2].addGrade(3, 92);
        student[2].addGrade(4, 94);

        for (int i = 0; i <student.length; i++) {
            student[i].printStudentInfor();
        }
    }
}
