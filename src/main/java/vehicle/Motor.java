package vehicle;

public class Motor extends Vehicle implements GearBox,Dashboard {
    private int capacity;
    private String kind;

    public boolean isItThatMovingForward() {
        return ifEngineIsOn;
    }

    @Override
    public String getBrand() {
        return "Motor";
    }

    @Override
    public int dashboardCapacity() {
        return capacity;
    }

    @Override
    public String gearBoxKind() {
        return kind;
    }
}
