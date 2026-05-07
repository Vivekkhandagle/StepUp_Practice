package com.example.oops.InnerClasses;

interface  Eatable{
    void fun();
}
public class AnonymousClassUsingInterface {
    public static void main(String[] args) {

        Eatable e=new Eatable() {
            @Override
            public void fun() {
                System.out.println("this is eatble class fun method");
            }
        };
        e.fun();
    }

}
