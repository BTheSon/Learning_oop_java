package qnu.fit.dse.oop.lab07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

        // Sử dụng Stream để lọc và sắp xếp danh sách
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());

        filteredNames.forEach(System.out::println);
    }
}
