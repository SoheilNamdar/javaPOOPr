package vehicle;

//Motor is a vehicle
public class Motor extends Vehicle implements WithDashboard, GearBox{
    public boolean isItThatMovingForward() {
        return ifEngineIsOn;
    }

    @Override
    public String getBrand() {
        return "Motor";
    }

    @Override
    public int capacity() {
        return 100;
    }

    @Override
    public String type() {
        return "Automatic";
    }
}
