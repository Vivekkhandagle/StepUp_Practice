package com.example.oops;

import java.util.TreeSet;

public class ProductSortTest {
    public static void main(String[] args) {
        Product product1=new Product(456,"Aaptop",6785,"Electronic");
        Product product2=new Product(45896,"Chair",6785,"Fernichair");
        Product product3=new Product(99,"Tube",6785,"Electrical");
        Product product4=new Product(23,"Book",6785,"Educational");

        TreeSet productIdTreeSet = new TreeSet();
        productIdTreeSet.add(product1);
        productIdTreeSet.add(product2);
        productIdTreeSet.add(product3);
        productIdTreeSet.add(product4);

        System.out.println(productIdTreeSet);

        TreeSet productNameTreeSet = new TreeSet(new MyProductNameComparator());
        productNameTreeSet.add(product1);
        productNameTreeSet.add(product2);
        productNameTreeSet.add(product3);
        productNameTreeSet.add(product4);

        System.out.println(productNameTreeSet);
    }
}
