package qnu.fit.dse.oop.Lab5b;

// interface cho bài test trọng tải
public interface PayloadTest {
    // hàm trả về đúng nếu trọng tải hợp pháp
    boolean isPayLoadLegal(int payloadLegal);
}

/*
* 1. Lập trình giải quyết bài toán được mô tả trong file đính kèm.
2. Mở rộng bài toán:
Bổ sung một số loại phương tiện mới cần giám sát, vd Truck (xe tải), Taxi, ...
Bổ sung tiêu chí kiểm tra về trọng tải cho các phương tiện
* work speed limit
* urbanspeed limit
* */