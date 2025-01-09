package Test;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2012, 12, 12);

        if (d1.compareTo(d2) > 0) {
            System.out.println("d1 là tương lai");
        }
        else
            System.out.println("d1 là quá khứ");

    }
}
