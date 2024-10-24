package qnu.fit.dse.oop.lab05.TH5;

public class SinhVien {
    private String hoTen;
    private DiemHP hp1, hp2;

    public SinhVien(String hoTen, DiemHP hp1, DiemHP hp2) {
        this.hoTen = hoTen;
        this.hp1 = hp1;
        this.hp2 = hp2;
    }

    public double tinhDTB() {
        return (hp1.tinhDiem() * hp1.laySoTinChi() + hp1.tinhDiem() * hp1.laySoTinChi())
                / (hp1.laySoTinChi() + hp2.laySoTinChi());
    }

    public String layHoTen() {
        return hoTen;
    }

    public DiemHP layHp1() {
        return hp1;
    }

    public DiemHP layHp2() {
        return hp2;
    }
}

