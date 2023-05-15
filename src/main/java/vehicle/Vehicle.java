package vehicle;

public abstract class Vehicle {
    boolean ifEngineIsOn;
    public void startEngine() {
        ifEngineIsOn = true;
    }
    public void stopEngine() {
        ifEngineIsOn = false;
    }

    public abstract boolean isItThatMovingForward() ;

    public abstract String getBrand();
}
