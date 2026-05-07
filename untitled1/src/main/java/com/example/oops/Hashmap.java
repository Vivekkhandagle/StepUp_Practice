package com.example.oops;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {

        Map <Integer,String> mp=new HashMap<>();
        //adding the values in hashmap
        mp.put(1,"vivek");
        mp.put(2,"viraj");
        mp.put(3,"Aniket");
        mp.put(4,"Atul");
        mp.put(5,"Kartik");

        //geting the values
        System.out.println(mp.get(1));
        System.out.println(mp.get(2));

        //update the value
        mp.put(1,"Aniket");
        System.out.println(mp.get(1));

        //remove the values
        mp.remove(1);
        System.out.println(mp);
        System.out.println( mp.remove(3));    //returns null

        //key is in hashmap

        System.out.println(mp.containsKey(2));

        // put when it absent

        mp.putIfAbsent(6,"vk");
        System.out.println(mp);

        //get only values
        System.out.println(mp.values());

        //get only keys
        System.out.println(mp.keySet());

        //get entries(key and values)
        System.out.println(mp.entrySet());



    }
}
