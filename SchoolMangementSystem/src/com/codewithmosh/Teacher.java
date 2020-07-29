package com.codewithmosh;

public class Teacher {

    private String name;
    private int id;
    private int salary;
    private int earnedmoney;

    public Teacher(String name, int id,int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        earnedmoney=0;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void recieveMoney(int money) {
        earnedmoney+=money;
        School.setTotalspentmoney(money);

    }

    public int remainingMoney()
    {
        return salary-earnedmoney;

    }



}
