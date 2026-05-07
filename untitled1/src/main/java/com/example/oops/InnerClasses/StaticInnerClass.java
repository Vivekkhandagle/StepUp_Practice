package com.example.oops.InnerClasses;

class Outerrr
{
    static int data=304;

    static class Inner{
       static void fun() {
            System.out.println(data);
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {

       Outerrr.Inner.fun();
    }
}
