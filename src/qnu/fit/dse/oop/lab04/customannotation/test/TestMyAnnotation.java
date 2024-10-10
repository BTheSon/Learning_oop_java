package qnu.fit.dse.oop.lab04.customannotation.test;

import java.lang.reflect.Method;
import qnu.fit.dse.oop.lab04.customannotation.MyAnnotation;
import qnu.fit.dse.oop.lab04.customannotation.MyAnnotationApply;

public class TestMyAnnotation
{
    public static void main(String[] args)
            throws NoSuchMethodException, SecurityException {
        MyAnnotationApply  myAnnotationApply = new MyAnnotationApply();

        myAnnotationApply.greeting();
        Method method = myAnnotationApply.getClass().getMethod("greeting");
        MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);

        System.out.println("value:::" + myAnnotation.value());
    }
}
