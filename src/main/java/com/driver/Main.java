package com.driver;

public class Main {

    // Task 1: create class Product inside Main
    public static class Product {

        // Task 3: method with 2 int parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: overloaded method with 3 int parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: overloaded method with 2 double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: create object of Product
        Product p = new Product();

        // Call all overloaded methods
        System.out.println(p.product(2, 3));       // 6
        System.out.println(p.product(5, 6, 7));    // 210
        System.out.println(p.product(3.14, 5.5));  // 17.27
    }
}
