package com.example.oops.serilizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream inputStream=new FileInputStream("student.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
        Student s=(Student) objectInputStream.readObject();
        objectInputStream.close();
        inputStream.close();
        System.out.println(s.id+ "   "+s.name);

    }
}
