CREATE DATABASE VehicleManager;
use VehicleManager;

CREATE TABLE Vehicle (
    soKhung VARCHAR(20) PRIMARY KEY, -- Khóa chính
    soMay VARCHAR(20) NOT NULL,
    mauSon VARCHAR(50) NOT NULL,
    hieuXe VARCHAR(50) NOT NULL,
    loaiDongCo VARCHAR(50) NOT NULL,
    namSX INT NOT NULL,
    xuatXu VARCHAR(50) NOT NULL,
    ngayNhap DATE NOT NULL,
    giaBan INT NOT NULL
);

CREATE TABLE Car (
    soKhung VARCHAR(20) PRIMARY KEY, -- Khóa chính, đồng thời là khóa ngoại
    soChoNgoi INT NOT NULL,
    dongCo VARCHAR(50) NOT NULL,
    maLuc VARCHAR(20) NOT NULL,
    phienBan VARCHAR(50) NOT NULL,
    khoangSangGamXe INT NOT NULL,
    FOREIGN KEY (soKhung) REFERENCES Vehicle(soKhung) ON DELETE CASCADE
);

CREATE TABLE Motorcycle (
    soKhung VARCHAR(20) PRIMARY KEY, -- Khóa chính, đồng thời là khóa ngoại
    doCaoYen INT NOT NULL,
    soPhanKhoi VARCHAR(20) NOT NULL,
    FOREIGN KEY (soKhung) REFERENCES Vehicle(soKhung) ON DELETE CASCADE
);
