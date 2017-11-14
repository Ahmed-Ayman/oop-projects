/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import static oop.Exercise3_2.even;

/**
 *
 * @author g
 */
public class Exercise4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String acount ="50";
        //call prime methed
        evenConvert(acount);
    }
    //methed that conver string to int and get even numbers
    public static void evenConvert(String acount){
        int number =Integer.parseInt(acount);
        //call even methed 
        even(number);
    
    }
    
}
