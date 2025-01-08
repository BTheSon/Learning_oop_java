package Test.valid;

import Test.log.ErrorLogger;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.regex.Pattern;

abstract public class ValidFieldVehicle {
    protected static final DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
    protected String[] record;
    protected int line;

//    public ValidFieldVehicle(String[] record, int line) {
//        this.record = record;
//        this.line = line;
//    }
    public ValidFieldVehicle(){}

    void setRecord(int line, String[] record) {
        this.line = line;
        this.record = record;
    }

    public String[] getRecord() {
        return record;
    }

    public int getLine() {
        return line;
    }

    public boolean mauSon() {
        return switch (record[3]) {
            case "Den", "Trang", "Xam", "Do" -> true;
            default -> false;
        };
    }
    public boolean ngayNhap() {
        try {
            LocalDate date = LocalDate.parse(record[8], fomatter);
        }
        catch (DateTimeParseException e) {
            ErrorLogger.logAttributeError(line, "Ngày nhập");
            return false;
        }
        return true;
    }
    public boolean soKhung() {
        boolean result = Pattern.matches("^[a-zA-Z0-9]{4}-[a-zA-Z0-9]{5}$", record[1]);
        if (!result)
            ErrorLogger.logAttributeError(line, "Số máy");
        return result;
    }

    public boolean soMay () {
        boolean result = Pattern.matches("^[a-zA-Z0-9]{4}-[a-zA-Z0-9]{5}$", record[2]);
        if (!result)
            ErrorLogger.logAttributeError(line, "Số máy");
        return result;
    }

    public abstract boolean giaBan();
    public abstract boolean hieuXe();
    // kiểm tra tính hợp lệ của thanh dòng datada hện tại
    public abstract boolean dataRedundancy();
    // kiểm tra dòng hienj tại có gặp bất kì lỗi fomat gì không
    public abstract boolean validRecord();
}
