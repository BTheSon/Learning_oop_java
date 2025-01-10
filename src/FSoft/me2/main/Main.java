package FSoft.me2.main;

import FSoft.me2.factory.VehicleFactory;
import FSoft.me2.model.Vehicle;
import FSoft.me2.repositories.DAO.DAOCar;
import FSoft.me2.repositories.DAO.DAOVehicle;
import FSoft.me2.repositories.DBUtil;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        List<Vehicle> list =  vehicleFactory.loadVehicelFromFile("log\\texxt.txt");
        try {
            DAOVehicle daoVehicle = new DAOVehicle();
            daoVehicle.addList(list);
        }catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
