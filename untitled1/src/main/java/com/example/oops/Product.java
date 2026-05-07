package com.example.oops;

public class Product implements Comparable{
    int productId;
    String productName;
    int productPrice;
    String productCategory;

    public Product(int productId,
                   String productName,
                   int productPrice,
                   String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int currentProdId = this.productId;
        Product product = (Product) o;
        int newProdId = product.productId;
        if (currentProdId > newProdId ) {
            return 1;
        } else if (currentProdId < newProdId) {
            return -1;
        }
        return 0;
    }
}
