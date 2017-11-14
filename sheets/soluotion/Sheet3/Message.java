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
public class Message {
    Person Fromobject = new Person("","");
    Person Toobject = new Person("","");
    MessageContent content =new MessageContent();
    //constuctor
    public  Message(Person Fromobject,Person Toobject,MessageContent content) {
    this.Fromobject=Fromobject ;
    this.Toobject=Toobject ;
    this.content =content ;}
    //display
    public void display() { 
        System.out.print("To :"+Fromobject.getname()+"("+Fromobject.getemail()+")\n"+
                "From :"+Toobject.getname()+"("+Toobject.getemail()+")\n"+
                "body :"+content.getbody()+"\n");
    
    }
     
}
