package com.example.oops.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortDemo1 {

        public static void main(String[] args) {
            List list=new ArrayList();
            list.add(new Employee(101,"vivek","Science",1500));
            list.add(new Employee(105,"Amol","Arts",15000));
            list.add(new Employee(103,"komal","Bcom",15003));
            list.add(new Employee(102,"sneha","Computer",15200));

            Collections.sort(list);

            System.out.println(list);

            Collections.sort(list,new SortedCustomDeptName());
            System.out.println(list);





    }
}
