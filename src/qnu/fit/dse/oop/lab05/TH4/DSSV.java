package qnu.fit.dse.oop.lab05.TH4;

import java.time.LocalDate;
import java.util.function.BiPredicate;


public class DSSV {
    private SV[] sinhViens;
    private int soSV;

    public DSSV(int maxArr) {
        this.sinhViens = new SV[maxArr];
        this.soSV = 0;
    }

    public void them(String hoTen, LocalDate ngaySinh, double dtb) {
        if (soSV < this.sinhViens.length)
            this.sinhViens[soSV++] = new SV(hoTen, ngaySinh, dtb);
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
        this.sort((SV a, SV b) -> {
            // nếu mà cùng họ và tên thì return luôn
            if (a.layHoTen().equalsIgnoreCase(b.layHoTen()))
                return false;

            // xếp tên theo Tên + Họ + Đệm
            String tempA = a.layTen() + " " + a.layHo() + " " + a.layDem();
            String tempB = b.layTen() + " " + b.layHo() + " " + b.layDem();

            // lấy chuỗi có kích thước ngắn nhất để lặp
            int minLength = Math.min(tempA.length(), tempB.length());

            // duyệt từng kí tự của cả hai chuỗi và so sánh
            for (int i = 0; i < minLength; ++i) {
                // nếu có kí tự khac trong cùng vị trí thì se so sánh kí tự bị khác đó
                if (tempA.charAt(i) != tempB.charAt(i)) {
                    return tempA.charAt(i) > tempB.charAt(i);
                }
            }
            // nếu hai chuối có kí tự từ 0 đến minLength bằng nhau
            // thì bắt đầu so sánh kích thước hai chuỗi để quyết dịnh
            return tempA.length() > tempB.length();
        });
    }

    public void sapTuoi() {
        this.sort((SV a, SV b) -> {
            return a.layTuoi() < b.layTuoi();
        });
    }

    public void sapDTB() {
        this.sort((SV a, SV b) -> {
            return a.layDtb() < b.layDtb();
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
            if (sinhViens[i].layXepLoai().equalsIgnoreCase(xepLoai)) {
                System.out.println("+================+");
                sinhViens[i].hienThi();
            }
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

    SV[] getSinhViens() {
        return sinhViens;
    }

    public int getSoSV() {
        return soSV;
    }

    // tham số: nhận mọt lamda func với trả true nếu  agrs đầu tiên nhỏ hơn args thứ hai (sắp tăng dần)
    private void sort (BiPredicate<SV, SV> lessThanFunc) {
        SV temp;
        int j = 0;

        for (int i = 0; i < soSV; i++) {
            temp = sinhViens[i];
            j = i - 1;
            while (j >= 0 && !lessThanFunc.test(temp, sinhViens[j])) {
                sinhViens[j + 1] = sinhViens[j];
                --j;
            }
            sinhViens[j + 1] = temp;
        }
    }
}
