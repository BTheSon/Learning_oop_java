package qnu.fit.dse.oop.lab05.TH5.Test;

import qnu.fit.dse.oop.lab05.TH3.Diem;
import qnu.fit.dse.oop.lab05.TH5.*;
public class Main5 {
    public static void main(String[] args) {
        SinhVien[] sinhViens = new SinhVien[3];

        sinhViens[0] = new SinhVien(
                "Bui The Son",
                new HPLyThuyet("Lap trinh co ban", 4, 10, 10, 9),
                new HPThucHanh("Lap trinh gamne", 3, 10, 10, 10)
        );

        sinhViens[1] = new SinhVien(
                "Phan Nguyen Gia Huy",
                new HPLyThuyet("Cau truc du lieu", 4, 9, 7, 8),
                new HPThucHanh("Lap trinh huong doi tuong", 3, 9, 8, 7)
        );

        sinhViens[2] = new SinhVien(
                "Tran Viet Tuan",
                new HPLyThuyet("Toan roi rac", 3, 8, 6, 7),
                new HPThucHanh("Phan tich thiet ke he thong", 4, 10, 9, 9)
        );

        for (SinhVien sinhVien : sinhViens) {
            System.out.println("++====================++");
            System.out.println("- Ho ten sinh vien: " + sinhVien.layHoTen());
            System.out.printf("- Hoc Phan: %s; \n\t+ Diem: %.2f\n", sinhVien.layHp1().layTenHP(), sinhVien.layHp1().tinhDiem());
            System.out.printf("- Hoc Phan: %s; \n\t+ Diem: %.2f\n", sinhVien.layHp2().layTenHP(), sinhVien.layHp2().tinhDiem());
            System.out.printf("- Diem trung binh hai hoc phan: %.2f", sinhVien.tinhDTB());
        }
    }
}

/*

Hãy viết chương trình thực hiện:
- Tạo mảng chứa 3 đối tượng sinh viên với các học phần có đủ loại lý thuyết và
thực hành.

- In thông tin của 3 đối tượng này lên màn hình bao gồm họ và tên, điểm 2 học
phần và điểm trung bình.
* */