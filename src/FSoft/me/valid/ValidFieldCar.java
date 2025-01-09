package FSoft.me.valid;

import FSoft.me.log.ErrorLogger;

public class ValidFieldCar extends  ValidFieldVehicle {

    public ValidFieldCar() {
        super();
    }

    @Override
    public boolean giaBan() {

        long sotien;
        try {
            sotien = Long.parseLong(record[9]);
        }
        catch (NumberFormatException e) {
            ErrorLogger.logAttributeError(line, "Giá bán");
            return false;
        }
        if (sotien < 0L || sotien > 3000000000L) {
            ErrorLogger.logAttributeError(line, "Giá bán");
            return false;
        }

        return true;
    }

    @Override
    public boolean hieuXe() {
        boolean result = switch (record[4]){
            case "HRV", "BRV", "CRV" ->true;
            default -> false;
        };
        if (!result)
            ErrorLogger.logAttributeError(line, "Hiệu xe");

        return result;
    }

    @Override
    public boolean dataRedundancy() {
        boolean result =record[record.length - 1].equalsIgnoreCase("None") &&
                record[record.length - 2].equalsIgnoreCase("None");
        if (!result)
            ErrorLogger.logDataRedundancy(line);

        return result;
    }

    @Override
    public boolean validRecord()  {
        return switch (record[0]) {
            // kiểm tra có đúng fomat kiểu xe không
            case "1", "2"
                    -> mauSon() && ngayNhap() && soKhung() && soMay() && giaBan() && hieuXe() && dataRedundancy();
            default -> false;
        };
    }

}
