package com.example.oops.threading;

public class SleepWithNegativeTIme extends  Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {

            try {
                Thread.sleep(-2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepWithNegativeTIme tIme=new SleepWithNegativeTIme();
        tIme.start();

    }
}
