package com.example.practice;

import java.util.Random;

public class MyLinkedList
{
    private MyNode head;

    public MyLinkedList(int num)
    {
        Random rand = new Random();
        MyNode initial = new MyNode(rand.nextInt(5));
        head = initial;
        /*for (int i = 0; i < rand.nextInt(20); i++)
        {

        }*/
    }


}
