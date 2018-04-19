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

    @Override
    public String toString() {
        return "(Car " + id + ": " + color + ", " + passengers + " passenger(s))--> ";
    }

    public static Car getRandomCar()
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

        int id = rand.nextInt(899)+100;
        String color = colors.get(rand.nextInt(colors.size()));
        int passenger = rand.nextInt(5)+1;

        return new Car(id,color,passenger);
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