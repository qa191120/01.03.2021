package com.example;

import lombok.ToString;

@ToString
public abstract class MainCourse extends FoodDish {
    protected float m_calories;

    @Override
    public void writeMainIngredients() {
        // debt was payed!!!!!!!
    }

    public MainCourse(String m_description, float m_price, float m_calories) {
        super(m_description, m_price);
        this.m_calories = m_calories;
    }

    public final void foo()
    {

    }
}
