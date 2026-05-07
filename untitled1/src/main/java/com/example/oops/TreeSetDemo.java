package com.example.oops;


import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        /*TreeSet intergerTreeSet = new TreeSet(new MyCustomeComparator());
        intergerTreeSet.add(34);
        intergerTreeSet.add(78);
        intergerTreeSet.add(90);
        intergerTreeSet.add(45);

        System.out.println(intergerTreeSet);*/

        /*TreeSet stringTreeSet = new TreeSet(new MyCustomeComparator());
        stringTreeSet.add("X");
        stringTreeSet.add("Q");
        stringTreeSet.add("Y");
        stringTreeSet.add("C");

        System.out.println(stringTreeSet);*/

        TreeSet stringBufferTreeSet = new TreeSet(new MyCustomeComparator());
        stringBufferTreeSet.add(new StringBuffer("Sampatrrer"));
        stringBufferTreeSet.add(new StringBuffer("Kir"));
        stringBufferTreeSet.add(new StringBuffer("Vivek"));
        stringBufferTreeSet.add("A");
        stringBufferTreeSet.add("G");
        stringBufferTreeSet.add("T");
        stringBufferTreeSet.add(new StringBuffer("Idea"));


        System.out.println(stringBufferTreeSet);


    }
}

