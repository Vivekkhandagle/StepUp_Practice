package com.example.oops;

public class classes {
public static class  Student{
    int roll_number;
    String name;
    Student(int roll_number,String name)
    {
        this.name=name;
        this.roll_number=roll_number;
        System.out.println(name+"  "  +roll_number);

    }



}
    public static void main(String[] args) {

    Student st=new Student(1,"vivek");
        Student st1=new Student(1,"vivek");
        Student st2=new Student(1,"vivek");
        Student st3=new Student(1,"vivek");

    }
}
