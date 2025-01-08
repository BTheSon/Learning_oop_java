package qnu.exam;

public class Motorcycle extends TestableVehicle{
    private int engineCapcity;

    public Motorcycle(String number, String name, int weight, int speed, int engineCapcity) {
        super(number, name, weight, speed);
        this.engineCapcity = engineCapcity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle information:");
        super.displayInfo();
        System.out.println("Engine capcity: "+ engineCapcity + " cc");
    }

    // getter setter

    public int getEngineCapcity() {
        return engineCapcity;
    }

    public void setEngineCapcity(int engineCapcity) {
        this.engineCapcity = engineCapcity;
    }
}
