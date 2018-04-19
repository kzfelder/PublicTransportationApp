package com.example.practice;

import java.util.ArrayList;
import java.util.Random;

public class HovLane
{
    private Car front;
    private HovLane next;

    public HovLane(int numCars)
    {
        //Car car = new Car();
        //car.getRandomCar();
        //System.out.println(car);
        front = Car.getRandomCar();
        System.out.println("Front: " + front);
        Car tempCar = Car.getRandomCar();
        next = new HovLane(tempCar);
        System.out.println("tempCar: " + next.front);

        //next = null; // Initially the HovLane is empty

        for (int i = 0; i < numCars - 2; i++)
        {
            Car newCar = Car.getRandomCar();
            //next = new HovLane(newCar);

            next = next.prepend(newCar);
            System.out.println("Car " + (i+2) + ": " + next.front);
            System.out.println("Size: " + next.size());
        }
        //System.out.println("Car: " + next.front);
        System.out.println("Final Size: " + next.size());
    }

    public HovLane(Car car)
    {
        front = car;
        next = new HovLane();
    }

    public HovLane prepend(Car car)
    {
        HovLane hovCar = new HovLane(car);
        HovLane temp = this;
        hovCar.next = temp;

        return hovCar;
    }

    public HovLane ()
    {
        Car car = Car.getRandomCar();
        //System.out.println(car);
        front = car;
        next = null;
    }


    @Override
    public String toString()
    {
        String link = "";
        HovLane temp = this;
        while (temp != null)
        {
            link = link + temp.front.toString();
            temp = temp.next;
        }
        return link;
    }

    public int size()
    {
        HovLane temp = this;
        int count = 0;
        if (temp != null)
        {
            count++;
        }
        while (temp.next != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
//        HovLane head = new HovLane(front);
//        String link = String.valueOf(head);
//        while (head.next != null)
//        {
//            link = link + " --> \n" + head.next;
//            head = head.next;
//        }
//        return link;
}
