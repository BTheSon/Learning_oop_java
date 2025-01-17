package qnu.exam;

public class TestableVehicle extends Vehicle implements SpeedTest {

    public TestableVehicle(String number, String name, int weight, int speed) {
        super(number, name, weight, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Speed: " + speed + " km/h");
    }

    @Override
    public boolean isSpeedLegal(int speedLimit) {
        return speed <= speedLimit;
    }
}
