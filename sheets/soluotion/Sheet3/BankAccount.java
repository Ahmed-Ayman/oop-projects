/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author g
 */
public class BankAccount {
    //variiables
    private  int accountNumber ;
    private String  accountName ;
    private double balance ;
    //constructor
    public BankAccount(String  accountName1, int accountNumber1){
      accountNumber =  accountNumber1 ;
      accountName =accountName1 ;
      balance =0;
    }
    //set name 
    public void setaccountName(String name){accountName=name;}
    //sheet 3 oop
    // overload constructor
     public BankAccount(String  accountName1, int accountNumber1,double balance1){
      accountNumber =  accountNumber1 ;
      accountName =accountName1 ;
      balance =balance1;
    }
     //Transfer function
      public void transfer(BankAccount fromAccount,BankAccount toAccount,double mount){
    fromAccount.withdraw(mount);
    toAccount.deposit(mount);
    }
    
    // deposit
    public double  deposit(double mount){
    balance += mount ;
    return balance ; 
    }
    //withdraw
    public double withdraw (double mount){
        if (balance>=mount){
    balance -= mount ;}
        else 
            System.out.println("mount exeed balance");
    return balance ; 
    }
    //get account balance
    public double getAccountBalance(){
    return balance;}
    //get account number
    public int getAccountNumber (){
    return accountNumber;}
    //get account name
    public String getAccountName(){
        return accountName ;
}
}
