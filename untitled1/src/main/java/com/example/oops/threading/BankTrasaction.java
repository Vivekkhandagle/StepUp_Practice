package com.example.oops.threading;

public class BankTrasaction extends  Thread {

    String name;

    BankTrasaction(String name)
    {
        this .name=name;
    }

    @Override
    public void run() {

        System.out.println(name+" started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" completed");

    }

    public static void main(String[] args) {
        BankTrasaction b1=new BankTrasaction("deposite");
        BankTrasaction b2=new BankTrasaction("withdraw");
        b1.start();
        b2.start();
    }
}
