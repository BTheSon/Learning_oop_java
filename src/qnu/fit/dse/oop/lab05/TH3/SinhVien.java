package qnu.fit.dse.oop.lab05.TH3;

// lớp sinh viên
public class SinhVien {
    private String hoTen;
    private Diem[] diems;

    public SinhVien(String hoTen, Diem diem, Diem... rest) {
        this.hoTen = hoTen;

        this.diems = new Diem[rest.length + 1];
        this.diems[0] = diem;
        System.arraycopy(rest, 0, this.diems, 1, rest.length );
    }
    /*
    *hàm thực hiện tính điểm trung bình hai môn của sinh vien
    * */
    public double tinhDTB() {
        long soTinChiHaiMon = 0;
        double tongDiem = 0.0;
        for (Diem diem : diems) {
            soTinChiHaiMon += diem.getSoTinChi();
            tongDiem += diem.tinDiem();
        }
        return tongDiem / soTinChiHaiMon;
    }

    public void gioiThieu() {
        System.out.println("#Ho Ten: "+ this.hoTen);
        System.out.println("#Cac hoc phan sinh vien dk: ");
        for (Diem diem : diems) {
            diem.thongTinHocPhan();
        }
        System.out.println("#Diem trung binh cua cac mon hoc: " + this.tinhDTB());
    }

}
