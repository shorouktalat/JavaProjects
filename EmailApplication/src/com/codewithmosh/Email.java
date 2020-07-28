package com.codewithmosh;

import java.util.Scanner;

public class Email {


    private  final String[] departments={"Sales","Developement","Accounting ",""} ;
    private String firstname;
    private String lastname;


    private String departement;
    private String password ;
    private int mailcapacity;



    private String email;
    private String alternatemail;
    private String companysuffix=".company.com";

    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;


        setDepartement();
        setEmail();
        
    }

    public void setDepartement() {
         System.out.println("1) sales \n 2)Developement \n 3)Accounting \n 4)none " );
        System.out.println("Enter your Departement");
        var scanner =new Scanner(System.in);
        var in =scanner.nextByte();
        this.departement=departments[in-1];
    }
    public void setEmail() {
        this.email=firstname+"."+lastname+"@"+departement+companysuffix;
    }

}
