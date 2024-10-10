package qnu.fit.dse.oop.lab02.entities;

public abstract class Teacher {
    private String designation;
    private String collegeName;

    public Teacher() {
        designation = null;
        collegeName = null;
    }
    public Teacher(String designation, String collegeName) {
        this.designation = designation;
        this.collegeName = collegeName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public String getDesignation() {
        return this.designation;
    }
    public String getCollegeName() {
        return collegeName;
    }

    abstract public void teach(String content);

    public void teach(int duration) {
        System.out.println("Giang day trong " + duration + " phut");
    }
}
