package qnu.fit.dse.oop.SomeTest;

abstract public class Vehicle {
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

    abstract public void displayInfo();
}
