package com.example.oops;

public class thread {
    public void printName() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread Priority: " +Thread.currentThread().getPriority());
    }
    public static void main(String args[]) {
        thread thread = new thread();
        thread.printName();
    }
}



