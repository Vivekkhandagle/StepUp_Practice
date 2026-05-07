package com.example.oops.InnerClasses;

class Outerr{
    int data=3453;
    void fun()
    {
        class Inner{
            void gun()
            {
                System.out.println(data);
            }
        }
        Inner inner=new Inner();
        inner.gun();

    }
}

public class LocalInnerClass {
    public static void main(String[] args) {

        Outerr outerr=new Outerr();
        outerr.fun();

    }
}
