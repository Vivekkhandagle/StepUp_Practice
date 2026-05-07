package com.example.oops.serilizable;

import java.io.*;

class Student implements  Serializable{
    int id;
    String name;
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }


}

public class Serilizable  {

    public static void main(String[] args) throws IOException {
        Student s=new Student(101,"vivek");

        FileOutputStream f=new FileOutputStream("student.txt");
        ObjectOutputStream ob=new ObjectOutputStream(f);
        ob.writeObject(s);

        f.close();
        ob.close();
        System.out.println("object stored successfully");


    }

}
