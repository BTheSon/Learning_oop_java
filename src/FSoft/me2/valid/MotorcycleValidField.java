package FSoft.me2.valid;

import static FSoft.me2.util.Constants.*;

import java.math.BigInteger;

public class MotorcycleValidField extends VehicleValidField{
    @Override
    public boolean giaBan() {
        BigInteger bigInteger = new BigInteger(fields[9].replace(".",""));
        return bigInteger.compareTo(new BigInteger("3000000000")) <= 0;
    }

    @Override
    public boolean hieuXe() {
        return fields[4].matches(REGEX_MOTORCYCLE_HIEU_XE);
    }

    @Override
    public boolean checkRedundantFields() {
        for (int i = 10; i <= 14; ++i) {
            if (!fields[i].equalsIgnoreCase(NONE_VALUE))
                return false;
        }
        return true;
    }
}
