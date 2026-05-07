package com.example.oops.threading;


public class SynchronizedBlockWithAnonymousClass {
    void fun() {
        synchronized (this) {
            for (int i = 0; i <= 5; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        SynchronizedBlockWithAnonymousClass ob = new SynchronizedBlockWithAnonymousClass();

        Thread t1 = new Thread() {
            public void run() {
                ob.fun();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                ob.fun();
            }
        };
        t1.start();
        t2.start();


    }
}
