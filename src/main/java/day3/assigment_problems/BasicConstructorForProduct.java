package main.java.day3.assigment_problems;

class Product {
    String productId;
    String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}

public class BasicConstructorForProduct {
    public static void main(String[] args) {
        Product product = new Product("P-1042", "Wireless Mouse");

        System.out.println(product.productId + " - " + product.productName);
    }
}