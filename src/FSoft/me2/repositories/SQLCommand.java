package FSoft.me2.repositories;

public class SQLCommand {
    public static final String SQL_INSERT_VEHICLE = "INSERT INTO Vehicle (soKhung, soMay, mauSon, hieuXe, loaiDongCo, namSX, xuatXu, ngayNhap, giaBan)\n" +
            "VALUES (?,?,?,?,?,?,?,?,?);";
    public static final String SQL_INSERT_CAR = "INSERT INTO Car (soKhung, soChoNgoi, dongCo, maLuc, phienBan, khoangSangGamXe)\n" +
            "VALUES (?, ?, ?, ?, ?, ?);";
    public static final String SQL_INSERT_MOTOCYCLE = "INSERT INTO Motorcycle (soKhung, doCaoYen, soPhanKhoi)\n" +
            "VALUES (?,?,?);";
}
