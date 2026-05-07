package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectionArrayList {
    public static void main(String[] args) {


      ArrayList<Integer>list=new ArrayList<>(Arrays.asList(10,20,45,30,40,50));

        System.out.println(list.reversed());
        int i=0;
        int j=list.size()-1;


        while(i<j)
        {
           Integer temp=Integer.valueOf(list.get(i));
           list.set(i,list.get(j));
           list.set(j,temp);


                    i++;
                    j--;

        }

    }
}
