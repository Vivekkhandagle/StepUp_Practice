package com.example.oops.InnerClasses;

class A
{
    private int num=100;
    class B{

        void fun()
        {
            System.out.println("num="+num);
        }
    }

}

public class FirstAnonymous {
    public static void main(String[] args) {
        A a=new A();

        A.B ob= a.new B();
        ob.fun();

    }
}
