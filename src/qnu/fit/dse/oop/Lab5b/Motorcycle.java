package qnu.fit.dse.oop.Lab5b;

public class Motorcycle extends TestableVehicle {
    private int engineCapacity;

    public Motorcycle(String number, String name, int weight, int speed, int engineCapacity) {
        super(number, name, weight, speed);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle information:");
        super.displayInfo();
        System.out.println("Engine capacity: "+ engineCapacity + " cc");
    }
}
