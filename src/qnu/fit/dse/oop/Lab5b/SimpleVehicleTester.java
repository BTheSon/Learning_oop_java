package qnu.fit.dse.oop.Lab5b;

import java.util.List;

public class SimpleVehicleTester {
    private static final String allvehicles = "vehicleds.txt";
    private static final String illegalvehicles = "illegalvehicles.txt";

    private List<TestableVehicle> vehicles;

    public void addVehicle(TestableVehicle testableVehicle) {
        vehicles.add(testableVehicle);
    }

    public void loadAddVehicle() {
        addVehicle(new Motorcycle("77m1-1111", "Wave", 97, 40, 110));
        addVehicle(new Car("77m1-1111", "Mazda", 2, 1070, 5));
        addVehicle(new Motorcycle("77m1-2222", "Sirius", 97, 60, 110));

    }

    public void showAllVehicles() {

    }

    public void showSpeedLegalVehicles(int speedLimit) {
        ;
    }
    public void saveSpeedLegalVehicles(int speedLimit) {
        ;
    }
}
