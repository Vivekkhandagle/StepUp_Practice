package com.example.oops.threading;

class Table1{

    static synchronized void fun()  {
        for(int i=0;i<5;i++)
        {
            try {
                Thread.sleep(200);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class T extends Thread{

    Table1 t;
    T(Table1 t)
    {
        this.t=t;
    }

    @Override
    public void run() {
        t.fun();
    }
}
class T2 extends Thread{

    Table1 t;
    T2(Table1 t)
    {
        this.t=t;
    }

    @Override
    public void run() {
        t.fun();
    }
}


public class StaticSynchronized {
    public static void main(String[] args) {
        Table1 t = new Table1();
       Table1 t3=new Table1();
        T t1 = new T(t);

        T2 t2 = new T2(t3);
        t1.start();


        t2.start();
    }

}
