package com.codewithmosh;

import java.util.Scanner;
import java.util.Arrays;

public class Email {


    private  final String[] departments={"Sales","Developement","Accounting ",""} ;
    private String firstname;

    private String lastname;
    private String departement;

    private final byte passwordlength=8;
    private char[] password =new char[passwordlength];



    private int mailcapacity;
    private String email;
    private String alternatemail;
    private String companysuffix=".company.com";

    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;


        setDepartement();
        setEmail();
        randomPassword();



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

    public void randomPassword() {
        String randpasswrd="abcdefghijklmnopqrstuvwxyz123456789$%^";
        for (byte i=0;i<passwordlength;i++) {
            var rand = (int) (Math.random() * randpasswrd.length());
            password[i] = randpasswrd.charAt(rand);

        }

    }
    public void changePassword(char[] password) {
        this.password = password;
    }

    public void setMailcapacity(int mailcapacity) {
        this.mailcapacity = mailcapacity;
    }

    public void setAlternatemail(String alternatemail) {
        this.alternatemail = alternatemail;

    }

    public void getname() {
        System.out.println( firstname+lastname);
    }

    public void getMailcapacity() {
        System.out.println( mailcapacity);
    }

    public void getEmail() {
        System.out.println( email);
    }




}
