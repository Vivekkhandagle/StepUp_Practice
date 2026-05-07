package com.example.oops.threading;

public class SleepWithCustomThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {

        SleepWithCustomThread thread=new SleepWithCustomThread();
        thread.start();
    }
}
