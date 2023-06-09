package vehicle.car;
import vehicle.Dashboard;
import vehicle.GearBox;
import vehicle.Vehicle;

import java.util.Objects;

//Car is a Vehicle
public class Car extends Vehicle implements GearBox, Dashboard, Comparable<Car> {  // DRY: Don't Repeat Yourself
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return dashboardCapacity == car.dashboardCapacity
                && Objects.equals(brand, car.brand)
                && gearType == car.gearType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, dashboardCapacity, gearType);
    }

    @Override
    public int compareTo(Car o) {
        int compareBasedOnDashBoardCapacity = Integer.compare(this.dashboardCapacity, o.dashboardCapacity);
        if (compareBasedOnDashBoardCapacity == 0){
            if (Objects.equals(this.gearType, Gear.MANUAL)){
                return -1;
            } else {
                return 1;
            }
        }
        return compareBasedOnDashBoardCapacity;
    }
}

