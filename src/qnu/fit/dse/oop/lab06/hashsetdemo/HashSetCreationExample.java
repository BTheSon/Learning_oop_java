package qnu.fit.dse.oop.lab06.hashsetdemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetCreationExample {
    public void createHashSet() {
        System.out.println("CreateHashSet() !!");
        Set<String> brands = new HashSet<>();

        brands.add("Gia Huy");
        brands.add("The Son");
        brands.add("Viet Tuan");
        brands.add("Quang Thang");
        brands.add("Gia Bao");

        int nOfElements = brands.size();
        System.out.printf("The set contains %d elements \n", nOfElements);
        System.out.println(brands);
    }
}
