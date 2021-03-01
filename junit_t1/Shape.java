package com.example;

public abstract class Shape {

    protected String m_name;

    public Shape(String m_name) {
        this.m_name = m_name;
    }

    public void foo() {
        // we can create non-abstract method inside an abstract class
    }

    public abstract double getArea(); // action-item

    public abstract double getHekef(); // action-item

    @Override
    public String toString() {
        return "Shape{" +
                "m_name='" + m_name + '\'' +
                ", area= " + getArea() + ", " +
                "hekef= " + getHekef() + " " +
                '}';
    }
}
