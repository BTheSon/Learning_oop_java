package FSoft.tbao;


import java.sql.*;
import java.util.List;

public class Database {
	
	private static final String URL = "jdbc:mysql://localhost:3306/vehicle";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	// 1. Số lượng dấu chấm hỏi tương đương số cột của bảng
	// 2. Cột của bảng là những tham số trong constructor của các lớp con tương ứng
	// public Car(<tham số>) {
	//     ...
	// }
	private static final String INSERT_CAR_STATEMENT =
			"insert into car"
			+ " values "
			+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String INSERT_MOTORBIKE_STATEMENT =
			"insert into motorbike"
			+ " values "
			+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static Connection connection = null;
	private static PreparedStatement preparedStatement = null;
	
	private static Connection getConnection() throws SQLException {
		if (connection == null || connection.isClosed()) {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		}
		return connection;
	}
	
	private static PreparedStatement getStatement(Vehicle v) throws SQLException {
		if (v instanceof Car) {
			return connection.prepareStatement(INSERT_CAR_STATEMENT);
		}
		if (v instanceof Motorbike) {
			return connection.prepareStatement(INSERT_MOTORBIKE_STATEMENT);
		}
		return null;
	}
	
	private static void closeAll() throws SQLException {
		if (connection != null) {
			connection.close();
		}
		if (preparedStatement != null) {
			preparedStatement.close();
		}
	}
	
	public static void addVehicleListToDatabase(List<Vehicle> list) throws SQLException {
		for (Vehicle v : list) {
			addVehicleToDatabase(v);
		}
	}
	
	private static void addVehicleToDatabase(Vehicle v) throws SQLException {
		try {
			connection = getConnection();
			preparedStatement = getStatement(v);
			try {
				preparedStatement.setString(1, v.getSoKhung());
				preparedStatement.setString(2, v.getSoMay());
				preparedStatement.setString(3, v.getMauSon());
				preparedStatement.setString(4, v.getHieuXe());
				preparedStatement.setString(5, v.getLoaiDongCo());
				preparedStatement.setInt(6, v.getNamSanXuat());
				preparedStatement.setString(7, v.getXuatXu());
				preparedStatement.setString(8, v.getNgayNhap());
				preparedStatement.setLong(9, v.getGiaBan());
				if (v instanceof Car) {
					Car c = (Car) v;
					preparedStatement.setInt(10, c.getSoChoNgoi());
					preparedStatement.setString(11, c.getDongCo());
					preparedStatement.setString(12, c.getMaLuc());
					preparedStatement.setString(13, c.getPhienBan());
					preparedStatement.setString(14, c.getKhoangSangGamXe());
				}
				if (v instanceof Motorbike) {
					Motorbike m = (Motorbike) v;
					preparedStatement.setString(10, m.getDoCaoYen());
					preparedStatement.setString(11, m.getSoPhanKhoi());
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
			preparedStatement.executeUpdate();
		} finally {
			try {
				closeAll();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
	
}