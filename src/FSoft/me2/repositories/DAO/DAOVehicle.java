package FSoft.me2.repositories.DAO;

import FSoft.me2.model.Vehicle;
import FSoft.me2.repositories.DBUtil;
import FSoft.me2.repositories.SQLCommand;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DAOVehicle {
    private PreparedStatement insertStament = null;

    protected Connection connection = null;

    public DAOVehicle () throws SQLException {
        connection = DBUtil.getInstance().getConection();
    }
    public void addList(List<Vehicle> vehicleList) throws SQLException {

        insertStament = connection.prepareStatement(SQLCommand.SQL_INSERT_VEHICLE);
        // tắt chế dộ tự động commit
        connection.setAutoCommit(false);

        for (Vehicle v : vehicleList) {
            addBatch(v);
        }

        insertStament.executeBatch();
        connection.commit();

        insertStament.close();
    }

    private void addBatch(Vehicle v) throws SQLException {
        insertStament.setString(1, v.getSoKhung());
        insertStament.setString(2, v.getSoMay());
        insertStament.setString(3, v.getMauSon());
        insertStament.setString(4, v.getHieuXe());
        insertStament.setString(5, v.getLoaiDongCo());
        insertStament.setInt(6, v.getNamSX());
        insertStament.setString(7, v.getXuatXU());
        insertStament.setDate(8, Date.valueOf(v.getNgayNhap()));
        insertStament.setInt(9, v.getGiaBan());

        insertStament.addBatch();
    }
}

