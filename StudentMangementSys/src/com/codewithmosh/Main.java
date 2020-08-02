package com.codewithmosh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("enter the number of tudents added to the database");
        Scanner scan=new Scanner(System.in);
         var num=scan.nextInt();

        var students=new Student[num];
        for (int i=0;i<num;i++ ){
            students[i]=new Student();
        }

        System.out.println(students[0].showInfo());
    }
}
