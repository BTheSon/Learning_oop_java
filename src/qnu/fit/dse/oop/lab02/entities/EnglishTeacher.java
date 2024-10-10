package qnu.fit.dse.oop.lab02.entities;

public class EnglishTeacher extends Teacher implements Actionable {
    //  Môn dạy chính
    private String mainSubject;

    public EnglishTeacher() {
        this.mainSubject = "";
    }

    public EnglishTeacher(String designation, String collegeName, String mainSubject) {
        super(designation, collegeName);
        this.mainSubject = mainSubject;
    }
    @Override
    public void teach(String content) {
        System.out.println("Giao Vien Anh dang day mon " + this.mainSubject + ", bai hoc:  " + content );
    }


    @Override
    public void toSchool() {
        System.out.println("Giao vien Anh toi truong bang xe may!");
    }

    public String getMainSubject() {
        return mainSubject;
    }
}
