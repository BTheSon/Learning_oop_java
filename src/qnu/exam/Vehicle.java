package qnu.exam;

public abstract class Vehicle {
    protected String number;
    protected String name;
    protected int weight;
    protected int speed;

    public Vehicle(String number, String name, int weight, int speed) {
        this.number = number;
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public abstract void displayInfo();

    // getter setter

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
