package qnu.fit.dse.oop.lab05.TH5;

abstract public class DiemHP {
    private String tenHP;
    private int soTinChi;

    public DiemHP(String tenHP, int soTinChi) {
        this.tenHP = tenHP;
        this.soTinChi = soTinChi;
    }

    public String layTenHP() {
        return tenHP;
    }

    public int laySoTinChi() {
        return soTinChi;
    }

    abstract public double tinhDiem();
}
