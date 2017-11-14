/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet3;

/**
 *
 * @author yousof
 */
public class Test_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank_Account savingAccount =new Bank_Account("jo", 1, 5000);
        Bank_Account currentAccount =new Bank_Account(null,2);
        currentAccount.setAccountName("hamada");
        Bank_Account.Transfer(savingAccount, currentAccount, 300);
        System.out.println(savingAccount.getAccountName()+" / "+
                savingAccount.getAccountNumber()+
                " => "+savingAccount.getBalance());
        System.out.println(currentAccount.getAccountName()+" / "+
                currentAccount.getAccountNumber()+
                " => "+currentAccount.getBalance());
        //---------------------------------------------
        Student first=new Student("1st");
        Student second=new Student("2nd");
        Student third=new Student("3rd");
        first.comment_Message("hi 1");
        first.comment_Message("test 1");
        second.comment_Message("hi 2");
        second.comment_Message("test 2");
        third.comment_Message("hi 3");
        third.comment_Message("test 3");
        System.out.println(Student.view_Wall());
        //---------------------------------------------
        Complex firstComplex=new Complex();
        Complex secondComplex=new Complex(10, 5);
        Complex thirdComplex=new Complex(secondComplex);
        firstComplex.adding(15);
        Complex.adding(firstComplex, secondComplex);
        secondComplex.subtract(10);
        Complex.subtract(thirdComplex,secondComplex );
        firstComplex.multiply(2);
        Complex.multiply(firstComplex,thirdComplex );
        System.out.println(Complex.display(firstComplex));
        System.out.println(Complex.display(secondComplex));
        System.out.println(Complex.display(thirdComplex));
        //----------------------------------
        Person person1=new Person("Hosam", "hosam@azhar.edu.eg");
        Person person2=new Person("Rohim", "rohim@azhar.edu.eg");
        MessageContent content=new MessageContent("", "");
        content.set_body("Next month there is surprise for student"+
                ", there is OOP exam");
       Message message=new Message(person1, person2, content) ;
       message.display();
    }
}
