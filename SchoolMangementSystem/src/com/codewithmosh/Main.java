package com.codewithmosh;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student student1=new Student("sss",10);
        Student student2=new Student("sss",20);
        Student student3=new Student("sss",30) ;
        Teacher t1=new Teacher("sss",10,20000);
        Teacher t2=new Teacher("sss",10,20000);
        Teacher t3=new Teacher("sss",10,2000);

        School sama =new School();
        sama.addStudent(student1);
        sama.addStudent(student2);
        sama.addStudent(student3);

        ;
        t1.recieveMoney(1000);
        t2.recieveMoney(1222);


        student1.payFees(1000);
        student2.payFees(1000);
        student3.payFees(1000);
        System.out.println(sama.getTotalearnedmoney());
        System.out.println(student1.remainingFees());
        System.out.println(sama.getTotalspentmoney());

    }
}
