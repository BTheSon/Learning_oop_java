package qnu.fit.dse.oop.lab05.TH4.Test;

import qnu.fit.dse.oop.lab05.TH4.DSSV;
import qnu.fit.dse.oop.lab05.TH4.SV;
import java.time.LocalDate;


public class Main4 {
    public static void main(String[] args) {
        // Tạo một danh sách gồm 5 sinh viên.
        DSSV dssv = new DSSV(5);
        dssv.them("Ngo Van Anh", LocalDate.of(2002, 8, 5), 8.8);
        dssv.them("Tran Thi Binh", LocalDate.of(2003, 5, 15), 8.4);
        dssv.them("Pham Thi Dung", LocalDate.of(2003, 3, 30), 5.0);
        dssv.them("Le Van Hoa", LocalDate.of(2004, 10, 10), 7.2);
        dssv.them("Nguyen Van Nam", LocalDate.of(2004, 1, 22), 9.6);

         // Sắp xếp danh sách theo họ tên
        dssv.sapHoTen();
        dssv.hienThi();

        //Liệt kê những sinh viên giỏi
        dssv.lietKeXepLoai("Gioi");

        //Tìm sinh viên tên Nam
        System.out.println("\n== Thong tinh sinh vien ten Nam ==");
        SV svNam =  dssv.timTen("Nam");
        if (svNam == null)
            System.out.println("Khong thay sinh vien ten nam tong danh sach");
        else
            svNam.hienThi();

        //Xóa sinh viên đầu tiên tên Hòa
        dssv.xoa("Hoa");
        System.out.println("\n==: Sinh vien ten Hoa dan bi xoa");

        //Tính tuổi trung bình
        int soSV = dssv.getSoSV();
        double sum = 0.0;
        double average = 0.0;
        for (int i = 0; i < soSV; i++)
            sum += dssv.laySV(i).layDtb();
        average = sum / soSV;
        System.out.println("==: Tuoi trung binh cua sinh vien trong danh sach la: " + average);


        // Tăng DTB lên 0.5 cho những SV sinh trước năm 1980.
        for (int i = 0; i < dssv.getSoSV(); ++i) {
            SV currentSV = dssv.laySV(i);   // tham chiếu tạm
            // lấy năm trong thuộc tính ngaysinh
            if  (currentSV.layNgaySinh().getYear() < 1980)
                currentSV.ganDtb(currentSV.layDtb() + 0.5); // tăng lên 0.5đ
        }
        System.out.println("da tang nhung sinh vien có nam sinh trc 1980 len 0.5d");

    }
}

/*



* */