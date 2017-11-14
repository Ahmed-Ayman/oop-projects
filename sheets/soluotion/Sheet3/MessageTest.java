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
public class MessageTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Person Fromobject = new Person("Ahmed","rohim@azhar.edu.eg");
    Person Toobject = new Person("Hosam","hosam@azhar.edu.eg");
    MessageContent content =new MessageContent();
    content.setcontent("Next month there is surprise for student, there is OOP exam");
        Message d =new Message( Fromobject, Toobject, content);
        d.display();
        
    }
    
}
