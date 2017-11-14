/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet2;

/**
 *
 * @author yousof
 */
public class bank_Account {
    private int	_account_number;
    private String _account_name;
    private double _balance;
    public bank_Account(String accountName,int number){
        _account_name=accountName;
        _account_number=number;
        _balance=0;
    }
    public void deposit(double amount){
        _balance+=amount;
    }
    public void withdraw(double amount){
        _balance-=amount;
    }
    public double getBalance(){
        return _balance;
    }
    public int getAccountNumber(){
        return _account_number;
    }
    public String getAccountName(){
        return _account_name;
    }
}
