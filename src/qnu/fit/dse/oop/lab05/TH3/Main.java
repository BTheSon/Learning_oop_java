package qnu.fit.dse.oop.lab05.TH3;

public class Main {
    public static void main(String[] args) {
        SinhVien[] sinhViens = new SinhVien[3];

        sinhViens[0] = new SinhVien(
                "Nguyen Van A",
                new Diem("Toan Cao Cap", 3, 10, 8, 6),
                new Diem("Vat Ly Luong Tu", 2, 19, 6, 4)
        );

        sinhViens[1] = new SinhVien(
                "Y Xuyen",
                new Diem("Toan Roi Rac", 2, 7, 7, 7),
                new Diem("Tieng Anh", 4, 10, 7, 5)
        );

        sinhViens[2] = new SinhVien(
                "Peter Yeager",
                new Diem("Tieng Phap", 3, 5, 8, 9),
                new Diem("Lich Su Dang", 1, 5, 4, 4)
        );

        for (SinhVien sinhVien : sinhViens) {
            System.out.println("//=======================================\\\\");
            sinhVien.gioiThieu();
        }
    }
}
