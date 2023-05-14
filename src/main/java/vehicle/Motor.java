package vehicle;

public class Motor {
    private boolean ifEngineIsOn;
    public void startEngine() {
        ifEngineIsOn = true;
    }
    public void stopEngine() {
        ifEngineIsOn = false;
    }
    public boolean isItThatMovingForward() {
        return ifEngineIsOn;
    }
}
