package com.example.practice;

import java.util.ArrayList;
import java.util.Random;

public class HovLane
{
    private Car front;
    private HovLane next = null;

    public HovLane(int size)
    {
        front = Car.getRandomCar();
        if(size > 1)
        {
            this.next = new HovLane(size - 1);
        }
    }

    public HovLane(Car car)
    {
        front = car;
        next = null;
    }

    public HovLane prepend(Car c)
    {
        HovLane hovCar = new HovLane(c);
        HovLane temp = this;
        hovCar.next = temp;

        return hovCar;
    }

    public HovLane ()
    {
        front = Car.getRandomCar();;
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
        int count = 1;
        while (temp.next != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
