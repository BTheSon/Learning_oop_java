package FSoft.me2.repositories.DAO;

import FSoft.me2.model.Car;
import FSoft.me2.model.Vehicle;
import FSoft.me2.repositories.SQLCommand;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DAOCar extends DAOVehicle {
    PreparedStatement carInsertStmt = null;
    public DAOCar() throws SQLException {
        super();
    }

    @Override
    public void addList(List<Vehicle> vehicleList) throws SQLException {
        super.addList(vehicleList);
        carInsertStmt = connection.prepareStatement(SQLCommand.SQL_INSERT_CAR);
        for (Vehicle v : vehicleList) {
            if (v instanceof Car) {
                addBatch((Car)v);
            }
        }
        carInsertStmt.executeBatch();
        connection.commit();

        carInsertStmt.close();
    }

    private void addBatch(Car car) throws SQLException {
        carInsertStmt.setString(1, car.getSoKhung());
        carInsertStmt.setInt(2, car.getSoChoNgoi());
        carInsertStmt.setString(3,car.getDongCo());
        carInsertStmt.setString(4, car.getMaLuc());
        carInsertStmt.setString(5, car.getPhienBan());
        carInsertStmt.setInt(6, car.getKhoangSangGamXe());
        carInsertStmt.addBatch();
    }

}
