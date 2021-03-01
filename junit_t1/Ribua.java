package com.example;

public class Ribua extends Meruba {

    public Ribua(double m_a) {
        super("Ribua", m_a, m_a, m_a, m_a);
    }

    @Override
    public double getArea() {
        return Math.pow(m_a, 2);
    }

    @Override
    public double getHekef() {
        return m_a * 4;
    }
}
