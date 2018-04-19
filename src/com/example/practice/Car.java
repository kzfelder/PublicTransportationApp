package com.example.practice;

import java.util.ArrayList;
import java.util.Random;

public class Car
{
    int id;
    String color;
    int passengers;

    public Car (int id, String color, int passengers)
    {
        this.id = id;
        this.color = color;
        this.passengers = passengers;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", passengers=" + passengers +
                '}';
    }

    public Car getRandomCar()
    {
        Random rand = new Random();
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("White");
        colors.add("Gold");
        colors.add("Silver");
        colors.add("Green");
        colors.add("Yellow");

        Car randCar = new Car(rand.nextInt(10), colors.get(rand.nextInt(colors.size())), rand.nextInt(6));
        return randCar;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getPassengers()
    {
        return passengers;
    }

    public void setPassengers(int passengers)
    {
        this.passengers = passengers;
    }
}