package com.example.practice;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\nHello, PublicTransportationApp!\n");
        //HovLane test = new HovLane();
        //System.out.println("\nCar: " + test);

        // Create HOV Lane
        HovLane lane = new HovLane(10);
        System.out.println("\nHOV Lane: \n" + lane);
        System.out.println("\nLane size: " + lane.size());

    }
}
