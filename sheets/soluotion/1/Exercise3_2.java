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
public class Exercise3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int endnum =50;
        //call even methed
        even(endnum);
    }
    //methed that print even number to end point
    public static void even(int endnum){
     for(int i=2 ;i<=endnum;i=i+2){
        System.out.println(i);
    }
    }
    
}
