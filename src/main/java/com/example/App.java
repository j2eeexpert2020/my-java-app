package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, CircleCI! Welcome to Java Maven!");

        // Sample functionality: Adding two numbers
        int result = add(5, 7);
        System.out.println("Sum of 5 and 7: " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
