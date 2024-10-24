package qnu.fit.dse.oop.lab06.hashsetdemo;

import java.util.HashSet;
import java.util.PrimitiveIterator;
import java.util.Set;

public class HashSetRemoveElementExample {
    public void removeElements() {
        System.out.println("removeElements() !!");
        Set<String> brands = new HashSet<>();

        brands.add("Gia Huy");
        brands.add("The Son");
        brands.add("Viet Tuan");
        brands.add("Quang Thang");
        brands.add("Gia Bao");

        Set<String> brands2 = new HashSet<>();

        brands2.add("Gia Bao");
        brands2.add("Viet Tuan");
        brands2.add("Quang Thang");

        System.out.println(brands);
        brands.remove("The Son");
        brands.remove("Gia Huy");

        System.out.println(brands);
        brands.removeAll(brands2);

        System.out.println(brands);

        if (brands.isEmpty()) {
            System.out.println("The brands set is empty");
        }
    }
}
