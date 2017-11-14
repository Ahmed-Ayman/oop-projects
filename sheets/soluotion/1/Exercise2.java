/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author g
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creat scanner object
        Scanner inpute = new Scanner(System.in);
        System.out.print("enter ur degree");
        int degree = inpute.nextInt();
        //call degree methed
        grad(degree);
       
    }
    //grad methed that calculeate score for student
    public static void grad (int degree){
     if(degree>=85)
     {System.out.println("Excellent");}
       else if(degree>=75)
       {System.out.println("V. Good");}
       else if(degree>=65)
       {System.out.println(" Good");}
       else if(degree>=50)
        {System.out.println("Passed");}
        else
       {System.out.println("Failed");}
    }
    
}
