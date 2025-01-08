package Test.Factory;

import Test.model.Vehicle;
import Test.valid.ValidFieldCar;
import Test.valid.ValidFieldMotorbike;
import Test.valid.ValidFieldVehicle;

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
