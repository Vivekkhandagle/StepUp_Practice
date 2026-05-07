package com.example.oops.InnerClasses;

class Outer
{
    private int num=314;
    class Inner{
        void fun()
        {
            System.out.println(num);
        }
    }
}

public class MamberInnerClass {
    public static void main(String[] args) {



    Outer outer=new Outer();
    Outer.Inner in=outer.new Inner();

    in.fun();

    }
}
