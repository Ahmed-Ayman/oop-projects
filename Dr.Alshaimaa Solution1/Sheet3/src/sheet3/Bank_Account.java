/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet3;

/**
 *
 * @author yousof
 */
public class Bank_Account {
    private int	_account_number;
    private String _account_name;
    private double _balance;
    public Bank_Account(String accountName,int number){
        _account_name=accountName;
        _account_number=number;
        _balance=0;
    }
    public Bank_Account(String _account_name,int _account_number,double _balance){
    this._account_name=_account_name;
    this._account_number=_account_number;
    this._balance=_balance;
    }
    // it should be static 
    public static void Transfer(Bank_Account from_account,Bank_Account to_account,double _balance){
        from_account.withdraw(_balance);
        to_account.deposit(_balance);
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
    public void setAccountName(String _account_name){
        this._account_name=_account_name;
    }
}


