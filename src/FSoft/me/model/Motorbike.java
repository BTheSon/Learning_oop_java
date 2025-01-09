package FSoft.me.model;

import java.time.LocalDate;

public class Motorbike extends Vehicle{
    private int doCaoYen;
    private String soPhanKhoi;

    public Motorbike(int soKhung, int soMay, String mauSon, String hieuXe, String loaiDongCo, String namSX, String xuatXU, LocalDate ngayNhap, int giaBan, int doCaoYen, String soPhanKhoi) {
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
