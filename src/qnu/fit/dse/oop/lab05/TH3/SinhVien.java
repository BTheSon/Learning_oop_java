package qnu.fit.dse.oop.lab05.TH3;

// lớp sinh viên
public class SinhVien {
    private String hoTen;
    private Diem dm1, dm2;

    public SinhVien(String hoTen, Diem dm1, Diem dm2) {
        this.hoTen = hoTen;
        this.dm1 = dm1;
        this.dm2 = dm2;
    }
    /*
    *hàm thực hiện tính điểm trung bình hai môn của sinh vien
    * */
    public double tinhDTB() {
        long soTinChiHaiMon = (long)dm1.getSoTinChi() * dm2.getSoTinChi();
        double tongDiem = dm1.tinDiem() * dm1.getSoTinChi() +  dm2.tinDiem() * dm2.getSoTinChi();

        return tongDiem / soTinChiHaiMon;
    }

    public void gioiThieu() {
        System.out.println("#Ho Ten: "+ this.hoTen);
        System.out.println("#Cac hoc phan sinh vien dk: ");

        dm1.thongTinHocPhan();
        dm2.thongTinHocPhan();
    }

    public String getHoTen() {
        return hoTen;
    }

    public Diem getDm1() {
        return dm1;
    }

    public Diem getDm2() {
        return dm2;
    }
}
