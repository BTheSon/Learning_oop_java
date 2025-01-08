package qnu.exam;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class SimpleVehicleTester {
    private String vehicleDatas;
    private String illegalVehicleDatas;
    private List<TestableVehicle> vehicles;

    // constructer khởi tạo các giá trị cho trường
    public SimpleVehicleTester() {
        vehicleDatas = "log\\vehicles.txt";
        illegalVehicleDatas = "log\\illegalVehicles.txt";
        vehicles = new ArrayList<TestableVehicle>();
    }

    // thêm phương tiện vào list
    public void addVehicle(TestableVehicle vehicle) {
        vehicles.add(vehicle);
    }

    // tải data từ file
    public void loadVehicle() {
        try {

            BufferedReader reader = new BufferedReader(new FileReader(vehicleDatas));
            String line;

            while ((line = reader.readLine()) != null) {
                TestableVehicle vehicle = buildFromData(line);
                if (vehicle != null) {
                    this.addVehicle(vehicle);
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

    public void showAllVehicles() {
        for (TestableVehicle v : vehicles) {
            v.displayInfo();
            System.out.println();   // xuống dư 1 dòng theo format của đề
        }
    }

    public void showAllLegalVehicel(int speedLimit) {
        for(TestableVehicle v : vehicles) {
            // kiểm tra vận tốc có hợp lệ không , nếu có thì in thông tin theo format đề
            if (v.isSpeedLegal(speedLimit)) {
                System.out.println(v.getName() + ": " + v.getNumber());
            }
        }
    }

    public void saveSpeedIllegalvehicles(int speedLimit) {
        BufferedWriter writer = null;
        try {

            // đoạn này nó ném ngoại lệ nên phải thêm try catch vào
            writer = new BufferedWriter(new FileWriter(illegalVehicleDatas));

            // ghi thời gian hiện tại vào file
            writer.write(LocalDate.now().toString() + "\n");

            // duyệt từng ptu trong list
            for(TestableVehicle v : vehicles) {
                if (!v.isSpeedLegal(speedLimit)) {  // kiểm tra xem có đi dúng vận tốc không
                    writer.write(v.getNumber() + "\n");
                }
            }
            // đóng file lại cho chắc sợ trừ điểm
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    // helpler function
    // các hàm hỗ trợ

    /*
    * xây dụng đối tượng từ dòng dữ liệu theo dấu ","
    * vd:
    *       "Car, 7701-1111, Mazda 2,1070,50,5"   (string)
    *       ->
    *       [Car, 7701-1111, Mazda 2,1070,50,5]   (string[])
    * */
    TestableVehicle buildFromData(String line) {
        // chia các thành phần data trong line hiện tại theo dấu "," và lưu vào mảng string
        String[] components = line.split(",");

        // kiểm tra dòng vị trí đầu tiên để xác định dòng data hiện tại là của Car hay Motorcycle
        return switch (components[0]) {
            case "Motorcycle" -> new Motorcycle(
                    components[1], // number
                    components[2], // name
                    Integer.parseInt(components[3]),    // weight
                    Integer.parseInt(components[4]),    // speed
                    Integer.parseInt(components[5])     // engineCapcity
            );
            case "Car" -> new Car(
                    components[1], // number
                    components[2], // name
                    Integer.parseInt(components[3]),    // weight
                    Integer.parseInt(components[4]),    // speed
                    Integer.parseInt(components[5])     // seatCount
            );
            default -> null;
        };
    }

    public static void main(String[] args) {
        SimpleVehicleTester vehicleTester = new SimpleVehicleTester();

        vehicleTester.loadVehicle();
        vehicleTester.showAllVehicles();
        vehicleTester.showAllLegalVehicel(SpeedTest.URBANSPEEDLIMIT);
        vehicleTester.saveSpeedIllegalvehicles(SpeedTest.URBANSPEEDLIMIT);
    }
}
