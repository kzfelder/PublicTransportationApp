package com.example.practice;

import java.util.ArrayList;
import java.util.Random;

public class HovLane
{
    private Car front;
    private HovLane next;

    public HovLane (int numCars)
    {
        HovLane hovHead = new HovLane();
        //System.out.println("\nhovHead: " + hovHead);
        for (int i = 0; i < numCars - 1; i++)
        {

            //int count = 0;
            HovLane tempHov = new HovLane();
            hovHead.prepend(tempHov);
            hovHead = tempHov;

            //System.out.println("\n1 tempHOV: " + tempHov);
            //System.out.println("2 hovHead.next == null: " + (hovHead.next == null));
            //System.out.println("3 hovhead.next: " + hovHead.next);

//            while (hovHead.next != null)
//            {
//                //count++;
//                //System.out.println("\n1 count: " + count);
//                hovHead = hovHead.next;
//                //System.out.println("2 hovHead: " + hovHead);
//                //System.out.println("3 hovHead.next: " + hovHead.next);
//            }
//            hovHead.next = tempHov;
            //System.out.println("1 hovHead.next: " + hovHead.next);
        }
    }

    public HovLane ()
    {
        Car car = new Car();
        car.getRandomCar();
        //System.out.println(car);
        front = car;
        next = null;
    }


    @Override
    public String toString()
    {
        String link = "";
        HovLane temp = this;
        while (temp != null) {
            link = link + temp.front.toString();
            temp = temp.next;
        }
        return link;
    }
//        HovLane head = new HovLane(front);
//        String link = String.valueOf(head);
//        while (head.next != null)
//        {
//            link = link + " --> \n" + head.next;
//            head = head.next;
//        }
//        return link;


    public void prepend(HovLane hovLink)
    {
        HovLane temp = this;
        hovLink.next = temp;
    }
}
