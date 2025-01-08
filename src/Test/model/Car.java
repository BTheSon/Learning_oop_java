package Test.model;

import java.time.LocalDate;


public class Car extends Vehicle{
    private int soChoNgoi;
    private String dongCo;
    private int maLuc;
    private int phienBan;
    private int khoangSangGamXe;

    public Car(int soKhung, int soMay, String mauSon, String hieuXe, String loaiDongCo, String namSX, String xuatXU, LocalDate ngayNhap, int giaBan, int soChoNgoi, String dongCo, int maLuc, int phienBan, int khoangSangGamXe) {
        super(soKhung, soMay, mauSon, hieuXe, loaiDongCo, namSX, xuatXU, ngayNhap, giaBan);
        this.soChoNgoi = soChoNgoi;
        this.dongCo = dongCo;
        this.maLuc = maLuc;
        this.phienBan = phienBan;
        this.khoangSangGamXe = khoangSangGamXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getDongCo() {
        return dongCo;
    }

    public void setDongCo(String dongCo) {
        this.dongCo = dongCo;
    }

    public int getMaLuc() {
        return maLuc;
    }

    public void setMaLuc(int maLuc) {
        this.maLuc = maLuc;
    }

    public int getPhienBan() {
        return phienBan;
    }

    public void setPhienBan(int phienBan) {
        this.phienBan = phienBan;
    }

    public int getKhoangSangGamXe() {
        return khoangSangGamXe;
    }

    public void setKhoangSangGamXe(int khoangSangGamXe) {
        this.khoangSangGamXe = khoangSangGamXe;
    }
}
