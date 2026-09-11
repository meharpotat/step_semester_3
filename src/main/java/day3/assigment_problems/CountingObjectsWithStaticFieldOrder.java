package main.java.day3.assigment_problems;

class Order {
    static int totalOrders = 0;

    public Order() {
        totalOrders++;
    }
}

public class CountingObjectsWithStaticFieldOrder {
    public static void main(String[] args) {
        new Order();
        new Order();
        new Order();
        new Order();

        System.out.println("Total orders: " + Order.totalOrders);
    }
}