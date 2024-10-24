package qnu.fit.dse.oop.Lab5b;

public class LoadCapacityTestable extends  TestableVehicle implements PayloadTest{
    public LoadCapacityTestable(String number, String name, int weight, int speed) {
        super(number, name, weight, speed);
    }


    @Override
    public boolean isPayLoadLegal(int payloadLegal) {
        return weight < payloadLegal;
    }
}
