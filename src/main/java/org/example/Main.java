package org.example;

import vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        if (car.isItThatMovingForward())  {
            System.out.println("Moving forward.");
        } else {
        System.out.println("The car is parked.");
        }
    }
}