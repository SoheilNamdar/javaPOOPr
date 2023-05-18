package vehicle;
//Car is a Vehicle
public class Car extends Vehicle implements GearBox, Dashboard  {  // DRY: Don't Repeat Yourself
        // Nested class
    public Car() {
    }
    public Car(String brand){
        this.brand = brand;
    }
    public Car(String brand, int dashboardCapacity, String gearType) {
        this.brand = brand;
        this.gearType = gearType;
        this.dashboardCapacity = dashboardCapacity;
    }
    boolean ifDoorIsOpen;
    String brand;
    int dashboardCapacity;
    String gearType;
    public void openDoor(){
            ifDoorIsOpen = true;
        }
    public void closeDoor(){
        ifDoorIsOpen = false;
    }
    public boolean isItThatMovingForward() {
        if (!ifDoorIsOpen && ifEngineIsOn) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getBrand() {
        return brand;
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
