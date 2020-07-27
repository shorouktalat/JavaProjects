package com.codewithmosh;

import java.util.Scanner;

public class BankAccount {




    private String customerName;
    private String customerId;
    private float balance;
    private int withDraw;
    private int deposit;
    private float lastTransaction;


//constractor
    public BankAccount(String customerName, String customerId) {
         this.customerName = customerName;
        this.customerId = customerId;
    }
    void setDeposit(int amount ) {
        this.balance +=amount ;
        lastTransaction=amount;
    }

    void setWithDraw(int amount){
        this.balance -=amount ;
        lastTransaction=+amount;
    }



    public void getLastTransaction() {
        if (lastTransaction>0)
            System.out.println("desposited" +Math.abs(lastTransaction));
        else if (lastTransaction<0)
            System.out.println("Withdrawed" +Math.abs(lastTransaction));
        else
            System.out.println("No Previous Transactions");

    }

    void   showMenu(){
        Byte input=0;
        var scanner =new Scanner(System.in);
        System.out.println("Customer :"+customerName);
        System.out.println("Customer Id"+customerId);
        System.out.println("1) Balance");
        System.out.println("2) Withdraw");
        System.out.println("3) Deposit");
        System.out.println("4) LastTransaction");
        System.out.println("5) Exit");


        do{
            System.out.println("Enter an option");
            input=scanner.nextByte();
            switch (input) {
                case 1:
                    System.out.println("Balance is :"+ balance);


                    break;
                case 2:
                    System.out.println("enter amount to withdraw");
                    withDraw=scanner.nextInt();
                    setWithDraw(withDraw);

                    break;
                case 3:
                    System.out.println("enter amount to Deposit");
                    deposit=scanner.nextInt();
                    setDeposit(deposit);

                    break;
                case 4:
                    getLastTransaction();
                    break;

                default:
                    break;

            }

        }while (input !=5);

    }



}
