package FSoft.me2.model;

import java.time.LocalDate;


public class Car extends Vehicle {
    private int soChoNgoi;
    private String dongCo;
    private String maLuc;
    private String phienBan;
    private int khoangSangGamXe;

    public Car(String soKhung, String soMay, String mauSon, String hieuXe, String loaiDongCo, int namSX, String xuatXU, LocalDate ngayNhap, int giaBan, int soChoNgoi, String dongCo, String maLuc, String phienBan, int khoangSangGamXe) {
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

    public String getMaLuc() {
        return maLuc;
    }

    public void setMaLuc(String maLuc) {
        this.maLuc = maLuc;
    }

    public String getPhienBan() {
        return phienBan;
    }

    public void setPhienBan(String phienBan) {
        this.phienBan = phienBan;
    }

    public int getKhoangSangGamXe() {
        return khoangSangGamXe;
    }

    public void setKhoangSangGamXe(int khoangSangGamXe) {
        this.khoangSangGamXe = khoangSangGamXe;
    }
}
