/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet2;



/**
 *
 * @author yousof
 */
public class TestClass {
    public static void main(String[]args){
        bank_Account savingAccount=new bank_Account("1St", 1);
        bank_Account currentAccount=new bank_Account("2nd", 2);
        bank_Account loanAccount=new bank_Account("3rd", 3);
        savingAccount.deposit(5000);
        currentAccount.deposit(2000);
        loanAccount.withdraw(1000);
        bank_Account loop=savingAccount;
        for(int i=1;i<4;i++){
        System.out.println(loop.getAccountName()+" / "+
                loop.getAccountNumber()+" => "+
                loop.getBalance());
        if(i==1)
            loop=currentAccount;
        else if(i==2)
            loop=loanAccount;
        }
        rectangle rec1=new rectangle();
        rectangle rec2=new rectangle(3,4);
        rec1.setLength(20);
        rec1.setheight(30);
        rectangle loop2=rec1;
        print2rec(loop2, rec1, rec2);
        rec2=rec1;
        print2rec(loop2, rec1, rec2);
        rec1.setheight(40);
        rec2.setheight(50);
        print2rec(loop2, rec1, rec2);
        
        
    }
    public static void print2rec(rectangle loop2,rectangle rec1,rectangle rec2){
        loop2=rec1;
        for(int j=1;j<3;j++){
            System.out.println("rectangle "+j+
                    " Area is : "+
                    loop2.getArea()
                    +" - perimeter is : "+
                    loop2.getPerimeter());
            if(j==1)
                loop2=rec2;
        }
    }  
    
}
