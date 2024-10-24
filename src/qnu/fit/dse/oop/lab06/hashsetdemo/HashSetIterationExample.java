package qnu.fit.dse.oop.lab06.hashsetdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetIterationExample {
    public void hashSetIterator() {
        System.out.println("hashSetIterator() !!");

        Set<String> brands = new HashSet<>();

        brands.add("Gia Huy");
        brands.add("The Son");
        brands.add("Viet Tuan");
        brands.add("Quang Thang");
        brands.add("Gia Bao");

        Iterator<String> iter = brands.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }
    }
}
