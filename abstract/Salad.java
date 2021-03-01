package com.example;

import lombok.ToString;

@ToString
// final class cannot be inherited!!
public class Salad extends MainCourse {

    protected String m_vegtables;

    public Salad(String m_description, float m_price, float m_calories, String m_vegtables) {
        super(m_description, m_price, m_calories);
        this.m_vegtables = m_vegtables;
    }

    @Override
    public void writeMainIngredients() {
        // debt was payed!!!!!!!
    }

}
