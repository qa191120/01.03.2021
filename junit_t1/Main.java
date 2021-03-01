package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        // abstract -- cannot create instance
        // abstract -- cannot create instance

        // final class -- cannot create derived classes
        // final method -- cannot be overridden in derived classes

        // abstract class
        // 1. can contain abstract methods
        // 2. is not obligated to implement abstract methods

        Circle c = new Circle("nice circle", 5.7);
        System.out.println(c);

        // Create JUnit
        // create:
        // Circle, Malben, and Ribua
        // test the get_area of each one
        // test the get_hekef of each one

    }


}
