package qnu.fit.dse.oop.lab05.TH4;
import java.time.LocalDate;

public class Main {
    public static boolean nameGreaterThan(String name1, String name2) {
    for (int i = 0; i < name1.length() && i < name2.length(); ++i) {
        if (name1.charAt(i) != name2.charAt(i)) {
            return name1.charAt(i) > name2.charAt(i);
        }
    }
    return name1.length() > name2.length();
}

    public static void main(String[] args) {
        String hoten = "bui";
        String temp = "buii";

        System.out.println(hoten.contains(temp));
    }
}
