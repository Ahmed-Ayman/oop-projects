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
    import javax.swing.JOptionPane;

public class Exercise4 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        //call methed of print
        print();
    }
    
    //print methed that print first and last name , age
    public static void print(){
    String message = "Please enter your first name";
    String firstName =JOptionPane.showInputDialog( null, message );
    message = "Please enter your  last name";
    String lastName =JOptionPane.showInputDialog( null, message );
    message = "Please enter your age";
    String age =JOptionPane.showInputDialog( null, message );
    System.out.println( "first name is: " + firstName + " last name is :"
            +lastName+" age is :" +age);
    }
    }

