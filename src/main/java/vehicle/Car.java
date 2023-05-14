package vehicle;
//Car is a Vehicle
public class Car extends Vehicle {  // DRY: Don't Repeat Yourself
        // Nested class
        public Car() {
        }
        public Car(String brand){
            this.brand = brand;
        }
        boolean ifDoorIsOpen;
        String brand;
        Driver driver;
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
}
