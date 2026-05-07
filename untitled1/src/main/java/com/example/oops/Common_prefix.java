package com.example.oops;

import java.util.Arrays;

public class Common_prefix {
    public static void main(String[] args) {


        String str[] = {"xivek", "viraj", "vaishnavi"};

        String str1 = str[0];
        String str2 = str[str.length - 1];
        int index = 0;

        while (index < str1.length() && index<str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            }
            else {
                break;
            }
        }

        if(index==0)
        {
            System.out.println("no common frefix");
        }
        else {
            System.out.println(str1.substring(0,index));
        }
    }

}
