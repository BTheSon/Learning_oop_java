package qnu.fit.dse.oop.lab05.TH5;

public class HPLyThuyet extends DiemHP {
    private int chuyenCan, giuaKy, cuoiKy;

    public HPLyThuyet(String tenHP, int soTinChi, int chuyenCan, int giuaKy, int cuoiKy) {
        super(tenHP, soTinChi);
        this.chuyenCan = chuyenCan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }

    @Override
    public double tinhDiem() {
        return chuyenCan * 0.1 + giuaKy * 0.2 + cuoiKy * 0.7;
    }
}
/*
*+ Lớp HPLyThuyet kế thừa từ lớp DiemHP: dùng để tính điểm cho các học phần lý
thuyết.
* Lớp này có các thuộc tính chuyenCan, giuaKy, cuoiKy tương ứng là điểm chuyên
cần, giữa kỳ, cuối kỳ của học phần.
*  Các điểm này là các số nguyên từ 0 đến 10. Công
thức tính điểm học phần như sau: (chuyenCan*0.1+giuaKy*0.2+cuoiKy*0.7).
* */
