package FSoft.me2.valid;

import static FSoft.me2.util.Constants.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// chỉ chuyên kiểm tra các trường sai định dạng
public abstract class VehicleValidField {

    protected String[] fields;

    // lấy record cần kiểm tra
    public void setRecord(String line) {
        fields = line.split(", ");
    }

    public void seRecord(String[] fields) {
        this.fields = fields;
    }

    public String[] getFieds() { return fields; }

    public boolean ngayNhap() {
        try {
            LocalDate ld = LocalDate.parse(fields[8], DATE_TIME_FORMATTER);  // kiểm tra logic
            return !ld.isBefore(LocalDate.now());  // kiểm tra ngày nhập có nhỏ hơn ngày hiện tại
        } catch (DateTimeException e) {
            return false;
        }
    }

    public boolean soKhung() {
        return fields[1].matches(REGEX_SO_KHUNG);
    }

    public boolean soMay() {
        return fields[2].matches(REGEX_SO_MAY);
    }

    public abstract boolean giaBan();

    public boolean mauSon() {
        return fields[3].matches(REGEX_MAU_SON);
    }

    public abstract boolean hieuXe();

    // kiểm tra trường dữ liệu có dư thừa không
    public abstract boolean checkRedundantFields();

    // phương thức trả về danh sách những trường lỗi định dạng
    public List<String> getListError() {
        List<String> errorList = new ArrayList<String>();
        if (!ngayNhap())
            errorList.add("Ngày nhập");
        if (!soKhung())
            errorList.add("Số khung");
        if (!soMay())
            errorList.add("Số máy");
        if (!giaBan())
            errorList.add("Giá bán");
        if (!mauSon())
            errorList.add("Màu sơn");
        if (!hieuXe())
            errorList.add("Hiệu xe");

        return errorList;
    }
}
