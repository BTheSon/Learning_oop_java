package qnu.fit.dse.oop.lab05.TH4;
import java.time.LocalDate;

public class SV {

    private String hoTen;
    private LocalDate ngaySinh;
    double dtb;

    public SV(String hoTen, LocalDate ngaySinh, double dtb) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }

    public String layHoTen() {
        return hoTen;
    }

    public void ganHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate layNgaySinh() {
        return ngaySinh;
    }

    public void ganNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double layDtb() {
        return dtb;
    }

    public void ganDtb(double dtb) {
        this.dtb = dtb;
    }

    void hienThi() {
         System.out.println("-Ho ten: " + hoTen);
         System.out.println("-Ngay sinh" + ngaySinh);
         System.out.println("-Diem trung binh" + dtb);
    }

    public String layHo() {
        // sử dụng phương thức split cắt String hoten theo " " và lưu vào mảng String
        // sau đó lấy ptu đầu tiêng trong mảng vừa cắt đó(tức là họ)
        return hoTen.split(" ")[0];
    }

    public String layTen() {
        // sử dụng phương thức split cắt String hoten theo " " và lưu vào mảng String
        // sau đó lấy ptu cuối trong mảng vừa cắt(tức là Tên)
        String[] temp = hoTen.split(" ");
        return temp[temp.length - 1];
    }

    public  String layDem() {
        // sử dụng phương thức split cắt String hoten theo " " và lưu vào mảng String
        // sau đó lấy ptu thứ 2 từ sau đếm lên trong mảng vừa cắt(tức là Đệm)
        String[] temp = hoTen.split(" ");
        return temp[temp.length - 2];
    }

    public int layTuoi() {
        // lấy năm của hiện tại và của ngày sinh
        return LocalDate.now().getYear() - ngaySinh.getYear();
    }

    public String layXepLoai() {
        if (dtb < 5)
            return "Yeu";
        if (dtb < 7)
            return "Trung Binh";
        if (dtb < 8)
            return "Kha";
        return "Gioi";
    }
}
