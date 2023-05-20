package vehicle.car;
import vehicle.Dashboard;
import vehicle.GearBox;
import vehicle.Vehicle;

//Car is a Vehicle
public class Car extends Vehicle implements GearBox, Dashboard {  // DRY: Don't Repeat Yourself
    private boolean ifDoorIsOpen;
    private String brand;
    private int dashboardCapacity;
    private Gear gearType;
    public Car(String brand){
        this.brand = brand;
    }
    public Car(String brand, int dashboardCapacity, Gear gearType) {
        this.brand = brand;
        this.gearType = gearType;
        this.dashboardCapacity = dashboardCapacity;
    }
    public void openDoor(){
            ifDoorIsOpen = true;
        }
    public void closeDoor(){
        ifDoorIsOpen = false;
    }
    public boolean isItThatMovingForward() {
        return !ifDoorIsOpen && ifEngineIsOn;
    }
    @Override
    public String getBrand() {
        return brand;
    }
    @Override
    public int dashboardCapacity() {
        return dashboardCapacity;
    }
    @Override
    public Gear gearBoxKind() {
        return gearType;
    }
    @Override
    public String toString() {
        return "Car {" +
                "ifDoorIsOpen = " + ifDoorIsOpen +
                " ,brand = '" + brand + '\'' +
                " ,dashboardCapacity = " + dashboardCapacity +
                " ,gearType = '" + gearType.toFrench() + " - " + gearType.toPersian() + '\'' +
                '}';
    }
}
