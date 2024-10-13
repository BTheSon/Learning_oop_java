package qnu.fit.dse.oop.lab05.TH5;

public class HPThucHanh extends DiemHP {
    private double db1, db2, db3;

    public HPThucHanh(String tenHP, int soTinChi, double db1, double db2, double db3) {
        super(tenHP, soTinChi);
        this.db1 = db1;
        this.db2 = db2;
        this.db3 = db3;
    }

    @Override
    public double tinhDiem() {
        return (double) (db1 + db2 + db3) / 3.0;
    }
}
/*
* + Lớp HPThucHanh kế thừa từ lớp DiemHP dùng để tính điểm cho các học phần thực
hành.
*  Lớp này có các thuộc tính db1, db2, db3 là điểm 3 bài thực hành, là các số thực từ
0 đến 10.
* Điểm của học phần thực hành được tính bằng trung bình cộng điểm 3 bài thực
hành.
* */