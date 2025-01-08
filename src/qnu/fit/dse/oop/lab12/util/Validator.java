package qnu.fit.dse.oop.lab12.util;

import java.util.regex.Pattern;

public class Validator {
    public static boolean isValidBillCode(String billCode) {
        return Pattern.matches("^(B)[0-9]{4}$", billCode);
    }
}
