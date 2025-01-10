package FSoft.me2.util;

import java.math.BigInteger;
import java.time.format.DateTimeFormatter;

public class Constants {
    public static final String NONE_VALUE = "None";
    public static final String REGEX_MAU_SON = "Den|Trang|Xam|Do";
    public static final String REGEX_SO_MAY = "^[a-zA-Z0-9]{4}-[a-zA-Z0-9]{5}$";
    public static final String REGEX_SO_KHUNG = REGEX_SO_MAY;
    public static final String REGEX_CAR_HIEU_XE = "HRV|BRV|CRV";
    public static final String REGEX_MOTORCYCLE_HIEU_XE =  "Lead|Vision|Air Blade";

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static final BigInteger MAX_CAR_GIA_BAN = new BigInteger("100000000");
}

/*
0 Lo?i xe
1 S? khung
2 S? m�y
3 M�u s?n
4 Hi?u xe
5 Lo?i ??ng c?
6 N?m s?n xu?t
7 Xu?t x?
8 Ng�y nh?p
9 Gi� b�n
10 S? ch? ng?i
11 ??ng c?
12 M� l?c
13 Phi�n b?n
14 Kho?ng s�ng g?m xe
15 ?? cao y�n
16 S? ph�n kh?i
*
* */