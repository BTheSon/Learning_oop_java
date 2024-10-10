package qnu.fit.dse.oop.lab02.entities;

public class MathTeacher extends Teacher implements Actionable {
    private String mainSubject;

    public MathTeacher() {
        this.mainSubject = null;
    }

    public MathTeacher(String designation, String collegeName, String mainSubject) {
        super(designation, collegeName);
        this.mainSubject = mainSubject;
    }
    @Override
    public void teach(String content) {
        System.out.println("Giao Vien Toan dang day mon " + this.mainSubject + ", bai hoc:  " + content );
    }

    public String toString() {
        return  String.format(
                    "MathTeacher [mainSubject=%s, getDesignation()=%s, getCollegename()=%s]",
                    this.mainSubject, this.getDesignation(), this.getCollegeName()
                );
    }

    @Override
    public void toSchool() {
        System.out.println("Giao vien Toan toi truong bang may bay");
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public String getMainSubject() {
        return mainSubject;
    }

}
