package com.example.oops;


import java.io.*;
import java.util.SortedMap;

public class main {



 public static void main(String[] args) {



//       File file=new File("E://java//file.txt");
//       if(file.createNewFile())
//       {
//           System.out.println("file is created");
//
//
//       }
//       else {
//           System.out.println("file is already exist");
//       }
try{
   FileOutputStream file=new FileOutputStream("E://java//file.txt");
    file.write("hello viraj".getBytes());

    System.out.println("file writes");

}
catch(IOException e)
{
    System.out.println(e);

}









 }
}

