package vehicle;

public class Car {
        // Nested class
        public Car() {
        }
        public Car(String brand){
            this.brand = brand;
        }
        boolean ifDoorIsOpen;
        boolean ifEngineIsOn;
        String brand;
        Driver driver;
        public void startEngine() {
            ifEngineIsOn = true;
        }
        public void stopEngine() {
            ifEngineIsOn = false;
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
}
