package com.codewithmosh;

public class Student {


    private String name;
    private int id;



    private int paidFees;
    private int totalFees;


    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        paidFees=0;
        totalFees=3000;
    }

    public void payFees(int paidFees) {
        if(paidFees<totalFees)
        this.paidFees += paidFees;


    }
    public int getPaidFees() {
        return paidFees;
    }

    public int remainingFees() {
       return totalFees - paidFees;
    }



}
