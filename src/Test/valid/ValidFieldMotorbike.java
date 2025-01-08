package Test.valid;

import Test.log.ErrorLogger;

public class ValidFieldMotorbike extends ValidFieldVehicle{

    public ValidFieldMotorbike() {
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
        if (sotien < 0L || sotien > 100000000L) {
            ErrorLogger.logAttributeError(line, "Giá bán");
            return false;
        }
        return true;
    }

    @Override
    public boolean hieuXe() {
        boolean result = switch (record[4]){
            case "Lead", "Vision", "Air Blade" ->true;
            default -> false;
        };
        if (!result)
            ErrorLogger.logAttributeError(line, "Hiệu xe");

        return result;
    }

    @Override
    public boolean dataRedundancy() {
        boolean result = false;
        for (int i = record.length - 1; i > 0 && i > record.length - 5; --i) {
            result = record[i].equalsIgnoreCase("None");
        }

        if (!result)
            ErrorLogger.logDataRedundancy(line);

        return result;
    }

    @Override
    public boolean validRecord() {
        return false;
    }
}
