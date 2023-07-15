package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: create an object of class RWOnly
        RWOnly obj = new RWOnly();

        // Task 4: try setting a value to name by directly accessing it using obj
        // obj.name = "John"; // Error: The variable name is private and cannot be accessed directly

        // Task 5: try implementing getter and setter member functions in class RWOnly
        obj.setName("John");
        System.out.println("Name: " + obj.getName());
    }
}