package com.example;

import lombok.ToString;

@ToString
// public final abstract class -- error!
public abstract class FoodDish {

    protected String m_description;
    protected float m_price;

    // 1. the method will NOT be implemented HERE!
    // 2. debt for the derived
    // private abstract func() -- error!
    // public abstract final func() -- error!
    public abstract void writeMainIngredients();

    public FoodDish(String m_description, float m_price) {
        this.m_description = m_description;
        this.m_price = m_price;
    }

}
