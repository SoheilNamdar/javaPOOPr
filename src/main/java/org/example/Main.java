package org.example;

import vehicle.Car;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = scanner.nextLine();

        System.out.println("What is your age ?");
        String age = scanner.nextLine();

        System.out.println(name + " your are " + age + " years old." );


    }
}