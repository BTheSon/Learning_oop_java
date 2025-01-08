package qnu.exam;

public class Car extends TestableVehicle{
    private int seatCount;

    public Car(String number, String name, int weight, int speed, int seatCount) {
        super(number, name, weight, speed);
        this.seatCount = seatCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car information:");
        super.displayInfo();
        System.out.println("Seat count: " + seatCount);
    }

    // getter setter

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}
