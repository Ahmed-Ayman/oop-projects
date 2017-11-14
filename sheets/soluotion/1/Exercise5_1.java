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
public class Exercise5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner inpute = new Scanner(System.in);
        int choise;
         do{ 
             System.out.print("Entr 2 number u want to  use the in orettion \n"
                + " in case u want add last nuber= 1 subtact =2 muliply =3 devide = 4\n");
             //get numbers from user
        int num1 =inpute.nextInt();
        int num2=inpute.nextInt();
        int operation= inpute.nextInt();
        //call methed
             double result =operation(num1,num2,operation);
          System.out.println("result = " +result);
        System.out.println( "in case u want to do more opertion enter 1 ");
         choise = inpute.nextInt();}
        while(choise==1);
        
    }
    //medthed that make mathmatic opertions
    public static  double operation(int num1,int num2,int operation){
 
        int result =0 ;
    switch(operation){
        case 1:
         result=num1+num2;
         break;
          case 2:
          result=num1-num2;
           break;
           case 3:
           result=num1*num2;
            break;
            case 4:
           result=num1/num2;
            break;
    }
    return result ;
    
}}
