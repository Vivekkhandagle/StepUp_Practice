package com.example.oops.InnerClasses;

import org.w3c.dom.ls.LSOutput;

abstract class OuterClass{
     abstract void fun();
}
public class AnonymousInnerClassUsingAbstractClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass() {
            @Override
            void fun() {
                System.out.println("this is fun method in Anonymous class");

            }
        };
        outerClass.fun();


    }
}
