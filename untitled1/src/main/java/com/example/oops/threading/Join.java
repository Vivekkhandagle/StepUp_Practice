package com.example.oops.threading;

public class Join extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("child thread:"+i);
        }
    }

    public static void main(String[] args)throws InterruptedException {
        Join j=new Join();
        j.start();
        j.join();
        for(int i=0;i<5;i++)
        {
            Thread.sleep(2000);
            System.out.println("Parent Thread:"+i);
        }
    }
}
