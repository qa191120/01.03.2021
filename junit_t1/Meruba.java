package com.example;

public abstract class Meruba extends Shape {

    double m_a, m_b, m_c, m_d;

    public Meruba(String m_name, double m_a, double m_b, double m_c, double m_d) {
        super(m_name);
        this.m_a = m_a;
        this.m_b = m_b;
        this.m_c = m_c;
        this.m_d = m_d;
    }

    @Override
    public double getHekef() {
        return m_a + m_b + m_c + m_d;
    }
}
