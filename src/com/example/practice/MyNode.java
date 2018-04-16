package com.example.practice;

public class MyNode
{
    int value;
    MyNode next;

    public MyNode(int num)
    {
        value = num;
        next = null;
    }

    @Override
    public String toString()
    {
        if(next == null)
        {
            return value + "";
            //return Integer.toString(value);
        }
        else
        {
            return value + " " + next.toString();
        }
    }
}