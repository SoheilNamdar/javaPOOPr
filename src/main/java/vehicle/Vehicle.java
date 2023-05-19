package vehicle;

public abstract class Vehicle {
    protected boolean ifEngineIsOn;
    int capacity;
    String kind;
    public void startEngine() {
        ifEngineIsOn = true;
    }

    public void stopEngine() {
        ifEngineIsOn = false;
    }

    public abstract boolean isItThatMovingForward();

    public abstract String getBrand();
    protected void protectedMethod(){
        System.out.println("This is a protected method.");
    };
    public String toString() {
        return "vehicle{}";
    }
}
