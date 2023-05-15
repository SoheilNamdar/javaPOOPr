package vehicle;

public class Ship extends Vehicle{
    @Override
    public boolean isItThatMovingForward() {
        return false;
    }

    @Override
    public String getBrand() {
        return "Ship";
    }
}
