import org.junit.jupiter.api.Test;

import static java.lang.System.out;
class CarTest {
    @Test
    void car_should_start_when_doorIsClosed_and_engineIsOn() {
        Car car = new Car();
        car.openDoor();
        car.closeDoor();
        car.move();

        out.println("Is the door open ? " + car.ifDoorIsOpen);
        out.println("------------------------------------------");

        Car pride = new Car("Pride");
        pride.startEngine();
        pride.move();
    }

    // Nested class
    class Car {

        Car() {
            //out.println("The car is moving forward with success ! ");
            out.println("The car's built with success.");
        }

        Car(String brand){
            this.brand = brand;
            out.println("A new " + this.brand + " has been built.");
        }
        // Data
        Boolean ifDoorIsOpen = true;
        Boolean ifEngineIsOn = true;
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

        public void move() {
            if (!ifDoorIsOpen && ifEngineIsOn) {
                out.println("The car is moving forward. ");
            } else {
                out.println("The car is parked.");
            }
        }

    }
}

