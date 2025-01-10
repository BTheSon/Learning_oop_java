package FSoft.me2.model;

import java.time.LocalDate;
public class Vehicle {
    private String soKhung;
    private String soMay;
    private String mauSon;
    private String hieuXe;
    private String loaiDongCo;
    private int namSX;
    private String xuatXU;
    private LocalDate ngayNhap;
    private int giaBan;


    public Vehicle(String soKhung, String soMay, String mauSon, String hieuXe, String loaiDongCo, int namSX, String xuatXU, LocalDate ngayNhap, int giaBan) {
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

    public String getSoKhung() {
        return soKhung;
    }

    public void setSoKhung(String soKhung) {
        this.soKhung = soKhung;
    }

    public String getSoMay() {
        return soMay;
    }

    public void setSoMay(String soMay) {
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

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
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
