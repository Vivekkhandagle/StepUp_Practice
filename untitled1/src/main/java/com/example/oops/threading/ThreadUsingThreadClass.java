package com.example.oops.threading;

class A extends  Thread{
    @Override
    public void run() {

        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }

}
public class ThreadUsingThreadClass  {
    public static void main(String[] args) {
        A ob=new A();
        ob.start();
    }

}
