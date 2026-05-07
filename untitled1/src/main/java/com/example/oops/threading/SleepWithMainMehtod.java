package com.example.oops.threading;

public class SleepWithMainMehtod {
    public static void main(String[] args) throws InterruptedException {

        for (int i=0;i<5;i++)
        {
            System.out.println(i);
            Thread.sleep(2000);
        }
    }
}
