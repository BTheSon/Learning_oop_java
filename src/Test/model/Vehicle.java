package Test.model;

import java.time.LocalDate;
public class Vehicle {
    private int soKhung;
    private int soMay;
    private String mauSon;
    private String hieuXe;
    private String loaiDongCo;
    private String namSX;
    private String xuatXU;
    private LocalDate ngayNhap;
    private int giaBan;


    public Vehicle(int soKhung, int soMay, String mauSon, String hieuXe, String loaiDongCo, String namSX, String xuatXU, LocalDate ngayNhap, int giaBan) {
        this.soKhung = soKhung;
        this.soMay = soMay;
        this.mauSon = mauSon;
        this.hieuXe = hieuXe;
        this.loaiDongCo = loaiDongCo;
        this.namSX = namSX;
        this.xuatXU = xuatXU;
        this.ngayNhap = ngayNhap;
        this.giaBan = giaBan;
    }

    public int getSoKhung() {
        return soKhung;
    }

    public void setSoKhung(int soKhung) {
        this.soKhung = soKhung;
    }

    public int getSoMay() {
        return soMay;
    }

    public void setSoMay(int soMay) {
        this.soMay = soMay;
    }

    public String getMauSon() {
        return mauSon;
    }

    public void setMauSon(String mauSon) {
        this.mauSon = mauSon;
    }

    public String getHieuXe() {
        return hieuXe;
    }

    public void setHieuXe(String hieuXe) {
        this.hieuXe = hieuXe;
    }

    public String getLoaiDongCo() {
        return loaiDongCo;
    }

    public void setLoaiDongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    public String getNamSX() {
        return namSX;
    }

    public void setNamSX(String namSX) {
        this.namSX = namSX;
    }

    public String getXuatXU() {
        return xuatXU;
    }

    public void setXuatXU(String xuatXU) {
        this.xuatXU = xuatXU;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

}
