package com.example.practice;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\nHello, PublicTransportationApp!\n");

        Random rand = new Random();
        int MCars = rand.nextInt(20);
        System.out.println(MCars);

        MyLinkedList hovLane = new MyLinkedList(MCars);
    }
}
