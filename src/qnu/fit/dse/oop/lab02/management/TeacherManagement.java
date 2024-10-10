package qnu.fit.dse.oop.lab02.management;

import qnu.fit.dse.oop.lab02.entities.MathTeacher;
import qnu.fit.dse.oop.lab02.entities.EnglishTeacher;
import qnu.fit.dse.oop.lab02.entities.Teacher;
import qnu.fit.dse.oop.lab02.entities.Actionable;

import java.security.PrivateKey;
import java.util.stream.StreamSupport;

public class TeacherManagement {

    private Teacher[] teachers;
    private final int MAX_TEACHER = 3;

    public TeacherManagement() {
        teachers = new Teacher[MAX_TEACHER];

        teachers[0] = new MathTeacher("Giang Vien", "Gia Huy", "Toan roi rac");
        teachers[1] = new EnglishTeacher("Giang Vien", "Viet Tuan", "Tieng Anh 2");
        teachers[2] = new MathTeacher("Giang Vien", "Quang Thang", "Giai tich 2");
    }

    public void printInfoTeacher() {
        for (int i = 0; i < MAX_TEACHER; ++i) {
            Teacher currentTeacher = teachers[i];

            System.out.println("\n =============[GIANG VIEN " + (i + 1) + " ]=============");
            System.out.println("Colleage name: " + currentTeacher.getCollegeName());

            if (currentTeacher instanceof MathTeacher) {
                MathTeacher mathTeacher = (MathTeacher)currentTeacher;

                System.out.println("Main subject: " + mathTeacher.getMainSubject());
                mathTeacher.toSchool();
                mathTeacher.teach("S" + (i + 2) + ": Toan");
            } else if (currentTeacher instanceof EnglishTeacher) {
                EnglishTeacher englishTeacher = (EnglishTeacher)currentTeacher;

                System.out.println("Main subject: " + englishTeacher.getMainSubject());
                englishTeacher.toSchool();
                englishTeacher.teach("Unit " + i +": Hello World");
            } else {
                System.out.println("Khong xac dinh loai giao vien");
            }
            currentTeacher.teach(12 + i * 12);
        }
    }

    public static void main(String[] args) {
        TeacherManagement teacherManagement = new TeacherManagement();
        teacherManagement.printInfoTeacher();
    }
}
