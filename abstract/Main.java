package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        // abstract -- cannot create instance
        //FoodDish dish = new FoodDish("Caesar salad", 58.7f);

        // abstract -- cannot create instance
        //MainCourse sushi = new MainCourse("Sushi", 58.7f, 500f);

        // final class -- cannot create derived classes
        // final method -- cannot be overridden in derived classes

        // abstract class
        // 1. can contain abstract methods
        // 2. is not obligated to implement abstract methods

        Salad ceaser_salad = new Salad("Caesar salad",
                58.7f, 500f, "lettuce, tomato...");

    }


}
