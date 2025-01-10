package FSoft.me2.valid;

import static FSoft.me2.util.Constants.*;
import java.math.BigInteger;

public class CarValidField extends VehicleValidField{
    @Override
    public boolean giaBan() {
        BigInteger bigInteger = new BigInteger(fields[9].replace(".",""));
        /*
        *   0: Nếu hai số BigInteger bằng nhau (có giá trị tương đương).
            -1: Nếu đối tượng this nhỏ hơn đối tượng val.
            1: Nếu đối tượng this lớn hơn đối tượng val.
        * */
        return bigInteger.compareTo(MAX_CAR_GIA_BAN) <= 0;
    }

    @Override
    public boolean hieuXe() {
        return fields[4].matches(REGEX_CAR_HIEU_XE);
    }


    @Override
    public boolean checkRedundantFields() {
        return fields[15].equalsIgnoreCase(NONE_VALUE) && fields[16].equalsIgnoreCase(NONE_VALUE);
    }
}
//Số chỗ ngồi, Động cơ, Mã lực, Phiên bản, Khoảng sáng gầm xe.