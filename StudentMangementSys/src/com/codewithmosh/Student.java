package com.codewithmosh;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
     private Scanner scanner=  new Scanner(System.in);
    private byte gradeYear;
    private final String[] courseList= {"Math101" ,"English101" , "History101" , "chemistry101" , "CS101","" };
    private String courses;
    private final int courseCost=600;



    private int balance;
    private static int id=0;

    public Student(){
        balance=0;
        courses="";

        System.out.println("plese enter first name ");
        firstName=scanner.next();
        System.out.println("plese enter Last name ");
        lastName=scanner.next();
        System.out.println("plese enter gradelevel \n 1)fresh \n 2)junior \n 3)senior   ");
        gradeYear=scanner.nextByte();


        setID();
        studentEnrollment();




    }
    private void setID()
    {
        id++;
        studentId=firstName+lastName+gradeYear+id;
    }


    private  void studentEnrollment()
    {
        int in;
        System.out.println
                ("enter courses \n 1)Math101 \n 2)English101 \n 3)History 101 \n 4)chemistry 101 \n 5)CS 101 \n 6)quit");

        do {
            in = (scanner.nextByte() - 1);
            courses = courses + courseList[in];
             if ((in != 5)) {
                balance = (balance + courseCost);
            }

        }while   ( in !=5);


    }

    public int getBalance() {
        return balance;
    }
    public void payTuition( int amount)
    {
        balance-=amount;
    }
}
