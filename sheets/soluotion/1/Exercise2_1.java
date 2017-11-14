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
public class Exercise2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inpute = new Scanner(System.in);
         System.out.print("enter 3 numbers to compare them");
        int num1=inpute.nextInt();
        int num2=inpute.nextInt();
        int num3=inpute.nextInt();
        int greatest =theGreatest(num1,num2,num3);
        System.out.println("the geatest number = " +greatest);

        
    }
    //methed that return the bigsest number
    public static int theGreatest(int num1,int num2,int num3){
    int theGreatest =Math.max(Math.max(num1,num2), num3);
    return theGreatest ;
    }
}
