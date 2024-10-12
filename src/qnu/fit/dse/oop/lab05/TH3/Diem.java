package qnu.fit.dse.oop.lab05.TH3;

public class Diem {
    private String tenHocPhan;
    private int soTinChi;
    private int chuyenCan, giuaKy, cuoiKy;

    public Diem(String tenHocPhan, int soTinChi, int chuyenCan, int giuaKy, int cuoiKy) {
        this.tenHocPhan = tenHocPhan;
        this.soTinChi = soTinChi;
        this.chuyenCan = chuyenCan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }

    double tinDiem() {
        return 0.1 * chuyenCan + 0.2  * giuaKy + 0.7 * cuoiKy;
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public int getChuyenCan() {
        return chuyenCan;
    }

    public int getGiuaKy() {
        return giuaKy;
    }

    public int getCuoiKy() {
        return cuoiKy;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void thongTinHocPhan() {
        System.out.println("-Ten hoc phan : " + tenHocPhan);
        System.out.println("\t+So tin chi   : " + soTinChi);
        System.out.println("\t+Diem         : " + tinDiem());
    }
}
