package qnu.fit.dse.oop.lab06.hashsetdemo;

import  java.util.HashSet;
import java.util.Set;

public class HashSetRetrieveElementExample {
    public void retrieveElement() {
        System.out.println("retrieveElement() !!");
        Set<String> brands = new HashSet<>();

        brands.add("Gia Huy");
        brands.add("The Son");
        brands.add("Viet Tuan");
        brands.add("Quang Thang");
        brands.add("Gia Bao");

        if (brands.contains("The Son")) {
            System.out.println("The set contains the The Son element");
        }else {
            System.out.println("The Set does not contain the The Son element");
        }

        brands.clear();

        if (brands.isEmpty()) {
            System.out.println("The set dosde not contain any elements.");
        }
    }
}
