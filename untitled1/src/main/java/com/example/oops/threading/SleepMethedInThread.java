package com.example.oops.threading;

public class SleepMethedInThread extends Thread{
    public void run()
    {
        System.out.println("start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end");

    }

    public static void main(String[] args) {
        SleepMethedInThread t=new SleepMethedInThread();
        t.start();
    }
}
