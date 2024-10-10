package qnu.fit.dse.oop.lab04.customannotation;

public class MyAnnotationApply {
    @MyAnnotation(value = 1)
    public void greeting() {
        System.out.println("day la phuong thuc greeting");
    }
}
