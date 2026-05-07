package com.example;


import java.sql.SQLOutput;
import java.util.Scanner;




public class Main {
    public static void main(String[] args)
    {

Scanner sc=new Scanner(System.in);


    StringBuilder str=new StringBuilder(sc.nextLine());


        for(int i=0;i<str.length();i++) {
            boolean flag = true;


            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ch == ' ') continue;
            if (ch >= 65) {
                if (ch > 97) flag = false;
                if (ch < 97) {
                    ascii += 32;
                    char dh = (char) ascii;
                    str.setCharAt(i, dh);
                } else {
                    ascii -= 32;
                    char mh = (char) ascii;
                    str.setCharAt(i, mh);
                }
            }
            else{
                System.out.println("no use numbers");
                break;
            }
        }
        System.out.println(str);
    }
}