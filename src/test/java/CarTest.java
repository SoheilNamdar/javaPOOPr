import static java.lang.System.out;
public class CarTest {
    // Nested class
    class Car {
        // Data
        Boolean ifDoorIsOpen;
        Boolean ifEngineIsOn;
        double length;
        double width;
        String brand;

        // To be (methods)
        void startEngine(){
            out.println("The engine is on.");
            ifEngineIsOn = true;
        }

        void stopEngine(){
            out.println("The engine is off.");
            ifEngineIsOn = false;
        }

        void openDoor(){
            out.println("The door is open.");
            ifDoorIsOpen = true;
        }

        void closeDoor(){
            out.println("The door is closed.");
            ifDoorIsOpen = false;
        }

        void move(){
            out.println("The car can move");
        }
    }
}

