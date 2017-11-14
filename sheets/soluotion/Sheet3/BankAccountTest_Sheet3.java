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
public class BankAccountTest_Sheet3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //sheet 3
        /* a)	create savingAccount bank accounts objects with 5000 as initial balance and your name */
         BankAccount savingAccount= new BankAccount("wafaa" ,1,5000);
        BankAccount currentAccount = new BankAccount("wafaa",2,0);
        currentAccount.setaccountName("Ahmed");
        currentAccount.transfer(savingAccount, currentAccount, 300);
        System.out.print("account name " +savingAccount.getAccountName()+
                "/account number "+savingAccount.getAccountNumber()+"  "+
                savingAccount.getAccountBalance() +" => balance \n"+"account name " 
                +currentAccount.getAccountName()+
                "/account number "+currentAccount.getAccountNumber()+"  "+
                currentAccount.getAccountBalance() +" => balance \n");
    }
    
}
