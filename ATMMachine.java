package com.company;
import java.util.Scanner;
public class ATMMachine {
    private double totalbal = 100;
    Scanner input = new Scanner(System.in);
    public int userAccount(){
        System.out.println("Enter Your Acccount Number:");
        int Account;
        Account = input.nextInt();
        return Account;
    }
    public int userPin(){
        System.out.println("Enter Your Pin Number:");
        int userPin;
        userPin = input.nextInt();
        return userPin;
    }
    public void StartATM(){
        userAccount();
        userPin();
        drawmainmenu();
    }
    public void drawmainmenu(){
        int selection;
        System.out.println("\n ATM main menu:");
        System.out.println("1 - View account balance");
        System.out.println("2 - withdraw funds");
        System.out.println("3 - Add funds");
        System.out.println("4 - Terminate transaction");
        System.out.println("Choice:");
        selection = input.nextInt();
        switch (selection)
        {
            case 1:
                Viewaccountinfo();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                addfunds();
                break;
            case 4:
                System.out.println("Thank You for using this ATM!! Have a nice day");
        }
    }
    public void Viewaccountinfo(){
        System.out.println("Account Information:");
        System.out.println("\t--Total balance: $"+totalbal);
        drawmainmenu();
    }
    public void deposit(int depAmount){
        System.out.println("\n***Please insert your money now...***");
        totalbal = totalbal+depAmount;
    }
    public void checkNsf(int withdrawAmount){
        if(totalbal<withdrawAmount)
            System.out.println("\n***Error!!! Insufficient funds in your account***");
        else
        {
            totalbal = totalbal-withdrawAmount;
            System.out.println("\n***Please Take your money now...***");
        }
    }
    public void addfunds(){
        int addselection;

        System.out.println("Deposit funds:");
        System.out.println("1 - $20");
        System.out.println("2 - $40");
        System.out.println("3 - $60");
        System.out.println("4 - $100");
        System.out.println("5 - Back to main menu");
        System.out.println("Choice:");
        addselection = input.nextInt();
        switch (addselection)
        {
            case 1:
                deposit(20);
                drawmainmenu();
                break;
            case 2:
                deposit(40);
                drawmainmenu();
                break;
            case 3:
                deposit(60);
                drawmainmenu();
                break;
            case 4:
                deposit(100);
                drawmainmenu();
                break;
            case 5:
                drawmainmenu();
                break;
        }
    }
    public void withdraw(){
        int withdrawselection;
        System.out.println("Withdraw money:");
        System.out.println("1 - $20");
        System.out.println("2 - $40");
        System.out.println("3 - $60");
        System.out.println("4 - $100");
        System.out.println("5 - Back to main menu");
        System.out.println("Choice:");
        withdrawselection = input.nextInt();
        switch (withdrawselection){
            case 1:
                checkNsf(20);
                drawmainmenu();
                break;
            case 2:
                checkNsf(40);
                drawmainmenu();
                break;
            case 3:
                checkNsf(60);
                drawmainmenu();
                break;
            case 4:
                checkNsf(100);
                drawmainmenu();
                break;
            case 5:
                drawmainmenu();
                break;
        }
    }

    public static void main(String[] args) {
        ATMMachine myAtm = new ATMMachine();
        myAtm.StartATM();
    }

}
