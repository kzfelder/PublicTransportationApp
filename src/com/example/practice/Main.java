package com.example.practice;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\nHello, PublicTransportationApp!\n");
        Car car = new Car();
        HovLane test = new HovLane(car);
        System.out.println("Car: " + test);

        HovLane huh = new HovLane(3);
        System.out.println("hov: " + huh);

    }
}
