package com.example.oops.threading;

public class DemonThread extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("demon");
        }
        else {
            System.out.println("user");
        }
    }

    public static void main(String[] args) {

        DemonThread t=new DemonThread();
        DemonThread t1=new DemonThread();
        DemonThread t2=new DemonThread();
        t.setDaemon(true);
        t.start();
        t1.start();
        t2.start();
    }


}
