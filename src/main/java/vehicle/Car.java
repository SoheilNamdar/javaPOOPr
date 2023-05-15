package vehicle;
//Car is a Vehicle
public class Car extends Vehicle implements GearBox, WithDashboard {  // DRY: Don't Repeat Yourself
        // Nested class
        public Car() {
        }
        public Car(String brand){
            this.brand = brand;
        }
        boolean ifDoorIsOpen;
        String brand;
        Driver driver;
    int dashboardCapacity;
    String gearType;
    public Car(String brand, int dashboardCapacity, String gearType) {
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
    public String type() {
        return "Automatic";
    }

    @Override
    public int capacity() {
        return 100;
    }
}
