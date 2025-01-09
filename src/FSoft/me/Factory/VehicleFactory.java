package FSoft.me.Factory;

import FSoft.me.model.Vehicle;
import FSoft.me.valid.ValidFieldCar;
import FSoft.me.valid.ValidFieldMotorbike;

import java.io.*;
import java.sql.Connection;
import java.util.List;

public class VehicleFactory {
    List<Vehicle> vehicles;
    void loadVehicleFromFile(String filePath) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            ValidFieldCar validFieldCar = new ValidFieldCar();
            ValidFieldMotorbike validFieldMotorbike = new ValidFieldMotorbike();

            while ((line = reader.readLine()) != null) {
                String[] component = line.split(", ");

            }
        }catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    void sendToDatabase(Connection con) {

    }
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
