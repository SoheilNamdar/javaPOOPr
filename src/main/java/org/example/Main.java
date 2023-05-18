package org.example;

import vehicle.Car;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        System.out.println("------------");

        String brand = args[0];
        String capacity = args[1];
        String type = args[2];
        Car car1 = new Car(brand, Integer.parseInt(capacity), type);
        System.out.println(car1.getBrand());

        Car car = new Car();
        if (car.isItThatMovingForward())  {
            System.out.println("Moving forward.");
        } else {
        System.out.println("The car is parked.");
        }
    }
}