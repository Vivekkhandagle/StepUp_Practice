package com.example.oops;

import java.util.Comparator;

public class MyProductNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Product product1 = (Product) o1;
        Product product2 = (Product) o2;
        return product1.productName.compareTo(product2.productName);
    }
}
