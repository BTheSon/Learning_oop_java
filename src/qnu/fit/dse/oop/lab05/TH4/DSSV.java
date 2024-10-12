package qnu.fit.dse.oop.lab05.TH4;

import java.util.Arrays;
import java.util.Comparator;

public class DSSV {
    private SV[] sinhViens;
    private int soSV;

    public DSSV(int maxArr) {
        this.sinhViens = new SV[maxArr];
        this.soSV = 0;
    }

    public void them(SV sv) {
        if (soSV < this.sinhViens.length)
            this.sinhViens[soSV++] = sv;
    }
    SV laySV(int index) {
        return (index <= soSV && index >= 0)?
                sinhViens[index] : null;
    }

    public void hienThi() {
        for (int i = 0; i < soSV; i++) {
            System.out.println("=====================");
            sinhViens[i].hienThi();
        }
    }

    public void sapHoTen() {
        Arrays.sort(sinhViens, new Comparator<SV>() {
            // định nghĩa lại hàm compare để so sánh theo họ tên
            @Override
            public int compare(SV a, SV b) {
                // nếu mà cùng họ và tên thì return luôn
                if (a.layHoTen().equalsIgnoreCase(b.layHoTen()))
                    return 0;

                // xếp tên theo Tên + Họ + Đệm
                String tempA = a.layTen() + " " + a.layHo() + " " + a.layDem();
                String tempB = b.layTen() + " " + b.layHo() + " " + b.layDem();

                // lấy chuỗi có kích thước ngắn nhất để lặp
                int minLength = Math.min(tempA.length(), tempB.length());

                // duyệt từng kí tự của cả hai chuỗi và so sánh
                for (int i = 0; i < minLength; ++i) {
                    if (tempA.charAt(i) != tempB.charAt(i)) {
                        return tempA.charAt(i) > tempB.charAt(i)? 1 : -1;
                    }
                }
                // nếu hai chuỗi từ 0 đến minLength bằng nhau
                // thì bắt đầu so sánh kích thước hai chuỗi để quyết dịnh
                return tempA.length() > tempB.length()? 1 : -1;
            }
        });
    }

    public void sapTuoi() {
        Arrays.sort(sinhViens, new Comparator<SV>() {
            // định nghĩa lại hàm compare để so sánh theo tuổi
            @Override
            public int compare(SV a, SV b) {
                int tuoiA = a.layTuoi();
                int tuoiB = b.layTuoi();
                if (tuoiA == tuoiB)
                    return 0;

                return tuoiA > tuoiB? 1 : -1;
            }
        });
    }

    public void  sapDTB() {
        Arrays.sort(sinhViens, new Comparator<SV>() {
            // định nghĩa lại hàm compare để so sánh theo điểm trung bình
            @Override
            public int compare(SV a, SV b) {
                double tuoiA = a.layDtb();
                double tuoiB = b.layDtb();

                if (tuoiA == tuoiB)
                    return 0;

                return tuoiA > tuoiB? 1 : -1;
            }
        });
    }

    public SV timTen(String ten) {
        for (int i = 0; i < soSV; i++) {
            if (sinhViens[i].layHoTen().contains(ten)) {
                return sinhViens[i];
            }
        }
        return null;
    }

    void lietKeXepLoai(String xepLoai) {
        for (int i = 0; i < soSV; i++) {
            if (sinhViens[i].layXepLoai().equalsIgnoreCase(xepLoai))
                sinhViens[i].hienThi();
        }
    }

    // hàm thự hiện xóa sv có tên là hoTen
    // hàm có thể làm xáo trộn mảng (đề đâu yêu cầu phải giữa đung vị trí)
    void xoa(String hoTen) {
        for (int i = 0; i < soSV; i++) {
            // kiêm tra có trùng họ tên không, nếu có thỉ đưa về cuối và giảm soSV
            if (sinhViens[i].layHoTen().equalsIgnoreCase(hoTen)) {
                sinhViens[soSV] = sinhViens[i];
                --soSV;
            }
        }
    }
}
