package vehicle;

import vehicle.car.Gear;

public class Motor extends Vehicle implements GearBox,Dashboard {
    private int dashboardCapacity;
    private Gear gearType;

    public boolean isItThatMovingForward() {
        return ifEngineIsOn;
    }

    @Override
    public String getBrand() {
        return "Motor";
    }

    @Override
    public int dashboardCapacity() {
        return dashboardCapacity;
    }

    @Override
    public Gear gearBoxKind() {
        return gearType;
    }
}
