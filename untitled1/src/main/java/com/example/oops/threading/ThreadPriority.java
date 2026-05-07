package com.example.oops.threading;

public class ThreadPriority extends Thread{

    @Override
    public void run() {
        System.out.println("inside the run method");
    }

    public static void main(String[] args) {
        ThreadPriority t1=new ThreadPriority();
        ThreadPriority t2=new ThreadPriority();
        ThreadPriority t3=new ThreadPriority();

        System.out.println("t1:"+t1.getPriority());
        System.out.println("t2:"+t2.getPriority());
        System.out.println("t3:"+t3.getPriority());
        t1.setPriority(10);
        t2.setPriority(7);
        t3.setPriority(3);

        System.out.println("t1:"+t1.getPriority());
        System.out.println("t2:"+t2.getPriority());
        System.out.println("t3:"+t3.getPriority());

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

    }
}
