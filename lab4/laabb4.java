package lab4;

import java.util.Scanner;

public class laabb4 {
    static int acc_no;
    static String acc_name; 
    static double balance;
    static Scanner sc=new Scanner(System.in);
    static int[] transactions=new int[2];
    static void newUser(){
        System.out.println("Enter account number:");
        acc_no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account name:");
        acc_name=sc.nextLine();
        System.out.println("Enter balance:");
        balance=sc.nextDouble();
        return;
      }
    static double deposit (){
        System.out.println("Enter amount to deposit:");
        double amount=sc.nextDouble();
        transactions[0]=(int)amount;
        balance = balance + amount;
        return balance;
      }
    static double withdrawl(){
        System.out.println("Enter amount to withdraw:");
        double amount=sc.nextDouble();
        transactions[1]=(int)amount;
        balance-=amount;
        return balance;
      }
    static void transactions (){
        for (int i : transactions) {
              System.out.println(i);
          }
      }
    static void summary (){
        System.out.println("Account name:"+acc_name);
        System.out.println("Account number:"+acc_no) ;
        System.out.println("Current balance:"+balance);
      }
            
            
      
  public static void main(String[] args) {
             
      newUser();
      System.out.println("Account summary");
      summary();        
      System.out.println("What do you want to do");
      System.out.println("1.Deposit money");
      System.out.println("2.Withdraw money");
      System.out.println("3.Print transactions");      
      int i=sc.nextInt();
      switch (i) {
        case 1:
            deposit();
            System.out.println("New Balance:"+balance);
        case 2:
            withdrawl();
            System.out.println("New Balance:"+balance);
        case 3:
            System.out.println("Transactions: ");
            transactions();
            break;
        case 4:
            System.out.println("Account summary");
            summary();
            break;
        }
    }
}