package com.example.polimorphism;

public class BaseCreditManger {


    public double calculate(double price){
        double rate = 1.18;
        return price * rate;

    }

    public double calculate (double price, double rate){
        return rate*price;

    }
}
