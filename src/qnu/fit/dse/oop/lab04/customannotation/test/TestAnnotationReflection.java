package qnu.fit.dse.oop.lab04.customannotation.test;

import java.lang.reflect.Method;
import qnu.fit.dse.oop.lab04.customannotation.AnnotationMarker;
import qnu.fit.dse.oop.lab04.customannotation.MyMarker;


public class TestAnnotationReflection {

    public static void main (String[] args) {
        AnnotationMarker annotationMarker = new AnnotationMarker();
        Method[] methods = annotationMarker.getClass().getMethods();

        for (Method method : methods) {
            MyMarker myMarker = method.getAnnotation(MyMarker.class);
            if (myMarker != null) {
                 try {
                    method.invoke(annotationMarker);
                 } catch (Exception e) {
                    e.printStackTrace();
                 }
             }
        }
    }
}
