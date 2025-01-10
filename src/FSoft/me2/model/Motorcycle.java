package FSoft.me2.model;

import java.time.LocalDate;
import java.util.List;

public class Motorcycle extends Vehicle{
    private int doCaoYen;
    private String soPhanKhoi;

    public Motorcycle(String soKhung, String soMay, String mauSon, String hieuXe, String loaiDongCo, int namSX, String xuatXU, LocalDate ngayNhap, int giaBan, int doCaoYen, String soPhanKhoi) {
        super(soKhung, soMay, mauSon, hieuXe, loaiDongCo, namSX, xuatXU, ngayNhap, giaBan);
        this.doCaoYen = doCaoYen;
        this.soPhanKhoi = soPhanKhoi;
    }

    public int getDoCaoYen() {
        return doCaoYen;
    }

    public void setDoCaoYen(int doCaoYen) {
        this.doCaoYen = doCaoYen;
    }

    public String getSoPhanKhoi() {
        return soPhanKhoi;
    }

    public void setSoPhanKhoi(String soPhanKhoi) {
        this.soPhanKhoi = soPhanKhoi;
    }

}
