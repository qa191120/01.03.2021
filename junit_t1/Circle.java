package com.example;

public class Circle extends Shape {

    protected double m_raidus;

    public Circle(String m_name, double m_raidus) {
        super(m_name);
        this.m_raidus = m_raidus;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(m_raidus, 2);
    }

    @Override
    public double getHekef() {
        return 2 * Math.PI * m_raidus;
    }
}
