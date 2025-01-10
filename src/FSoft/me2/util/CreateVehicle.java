package FSoft.me2.util;
import java.util.List;
/*
* interface dùng để khai báo cách object tạo đối tượng từ dòng dữ liệu
* */
public interface CreateVehicle {
    /*
    * record:   dòng dữ liệu
    * return:   những trường không hợp lệ trong record
    * */
    List<String> createWithData(String record);
}
