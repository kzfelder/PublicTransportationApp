package com.example.practice;

import java.util.ArrayList;
import java.util.Random;

public class HovLane
{
    private Car front;
    private HovLane next;

    public HovLane (int numCars)
    {
        front.getRandomCar();
        HovLane head = new HovLane(front.getRandomCar());
        for (int i = 0; i < numCars; i++)
        {
            Car temp = new Car();
            HovLane tempHov = new HovLane(temp.getRandomCar());
            while (head.next.equals(null))
            {
                head.next = tempHov;
            }
        }
        System.out.println(front.toString());
    }

    public HovLane (Car car)
    {
        car.getRandomCar();
        System.out.println(car);
        front = car;
        next = null;
    }


    @Override
    public String toString()
    {
        //while ()
        return "HovLane{" +
                "front=" + front +
                '}';
    }
}
