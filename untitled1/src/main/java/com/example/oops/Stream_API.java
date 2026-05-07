package com.example.oops;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Stream_API {
    public static void main(String[] args) {


       ArrayList<Integer> st=new ArrayList<>( Arrays.asList(1015,20,30,40,50));

//        Stream<Integer> st1= st.stream();
//
//        List<Integer> list=st1.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(list);

        List<Integer> newlist=st.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newlist);

        Stream<Integer> empty=Stream.empty();
        empty.forEach (i-> System.out.println(i));




        List<Integer>st1=new LinkedList<>();
        st1.add(10);
        st1.add(20);
        st1.add(30);

        Stream st2=st1.stream();
        st2.forEach(e-> System.out.println(e));

        List<String>  mn= List.of("Vivek","Viraj","Vaishnavi","ANiket");

        List<String>stream=mn.stream().filter(e->e.startsWith("V")).collect(Collectors.toList());
        System.out.println(stream);


        List<Integer> list=List.of(10,20,30,40,50,50,40);
        List<Integer> an=list.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(an);
    }
}
