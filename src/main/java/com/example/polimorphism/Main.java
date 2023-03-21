package com.example.polimorphism;

import com.example.polimorphism.BaseCreditManger;
import com.example.polimorphism.FarmerCreditManager;
import com.example.polimorphism.StudentCreditManager;
import com.example.polimorphism.TeacherCreditManager;

public class Main {

    public static void main(String[] args) {

        BaseCreditManger[] baseCreditMangers = new BaseCreditManger[]
                {new StudentCreditManager(), new FarmerCreditManager(), new TeacherCreditManager()};

        for (BaseCreditManger creditManager : baseCreditMangers ) {
            System.out.println(creditManager.calculate(1000,2.5));

        }


    }



    }

