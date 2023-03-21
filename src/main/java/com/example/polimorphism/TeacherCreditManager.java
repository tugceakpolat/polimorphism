package com.example.polimorphism;

import com.example.polimorphism.BaseCreditManger;

public class TeacherCreditManager extends BaseCreditManger {

    @Override
    public double calculate(double price) {
        double rate = 1.0;

        return price*rate;
    }

    @Override
    public double calculate(double price, double rate) {
         rate = 1.0;
        return price*rate;
    }
}
