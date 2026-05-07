package com.example.oops;

import java.util.HashMap;
import java.util.Map;

public class Frequent_Element_In_Array {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,1,2,1,2,1,8,9,0};

        Map<Integer,Integer> mp=new HashMap<>();

        for(Integer ar:arr)
        {
            if(!mp.containsKey(ar))
            {
                mp.put(ar,1);
            }
            else {
                mp.put(ar,mp.get(ar)+1);
            }


        }
        System.out.println("frequence map");
        System.out.println(mp.entrySet());
    }
}
