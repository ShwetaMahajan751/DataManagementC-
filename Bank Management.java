package com.company;
import java.util.Scanner;
public class sepmProject {
    public static void main(String[] args) {

        double balance = 0;
        double amount=0;
        double amount1=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.print("Enter Your Name:-");
        String customerName = sc.nextLine();
        System.out.print("Enter ID:-");
        String custermerid = sc.nextLine();
        System.out.println("=======================================");
        System.out.println("HELLO, "+ customerName + " !!");
        System.out.println("Your ID: " + custermerid);
        System.out.println("===========================");
        System.out.println("Select Your Choice");
        System.out.println("===========================");
        System.out.println("1. Check Bank Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Previous Transaction");
        System.out.println("5. Calculate Interest");
        System.out.println("6. Log out");
        int option;
        {
        do {
            System.out.println("===========================");
            System.out.print("Enter Your Choice:-");
            option = sc.nextInt();
            System.out.println("===========================");

            switch (option) {
                case 1:
                    System.out.println("Your Bank Balance:" + balance);
                    System.out.println("===========================");
                    break;

                case 2:
                    System.out.print("Enter Amount:- ");
                    amount= sc.nextDouble();
                    balance = balance + amount;
                    System.out.println("Your Bank Balance After Deposit:" + balance);
                    System.out.println("===========================");
                    break;

                case 3:
                    System.out.print("Enter Amount:- ");
                    amount1= sc.nextDouble();
                    balance = balance - amount1;
                    System.out.println("Your Bank Balance After Withdrawal:" + balance);
                    System.out.println("===========================");
                    break;

                case 4:
                    System.out.println("***Recent Previous Transaction***");
                    if(balance==amount)
                    {
                        System.out.println("Account Credited with Rs. "+amount);
                    }
                    if (balance<amount)
                    {
                        System.out.println("Account Debited with Rs. "+amount1);
                    }
                    else
                    {
                        System.out.println("No Transactions Occured");
                    }
                    break;

                case 5:
                    System.out.print("Enter Number Of Years:-");
                    double years = sc.nextDouble();
                    double interestrate = 2.7;
                    double interest = (balance * interestrate * (years / 100));
                    double newbalance = (balance * interestrate * (years / 100)) + balance;
                    System.out.println("Your Interest after " + years + " years is :-" + interest);
                    System.out.println("After " + years + " years your new balance will be : " + newbalance);
                    break;

                case 6:
                    System.out.println("You Have Successfully Logged off !! ");
                    System.out.println("Thank You "+customerName+" !!");
                    System.out.println("===========================");
                    break;

                default:
                    System.out.println("Warning!! Please Enter a valid option");
                    System.out.println("Please Enter 1,2,3,4,5,6");
                    break;
            }
        }while(option!=6);
    }
    }
}
