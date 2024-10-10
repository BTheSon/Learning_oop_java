package qnu.fit.dse.oop.lab04.customannotation;

public class AnnotationMarker {
    @MyMarker
    public void someMethod1() {
        System.out.println("phuong thuc 1 dc call");
    }

    public void someMethod2() {
        System.out.println("phuong thuc 2 dc call");
    }
    @MyMarker
    public void someMethod3() {
        System.out.println("phuong thuc 3 dc call");
    }

    public void someMethod4() {
        System.out.println("phuong thuc 4 dc call");
    }
}
