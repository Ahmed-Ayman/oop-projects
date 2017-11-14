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
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner inpute = new Scanner(System.in);
        System.out.print(" enter lenght and wedth\n"
                + " when shape is circle enter wedth =1 \n"
                + "and assige lenght as r to cricle"+
                "\n in Case shape  is circle last number = 2, \n "
                + "rectangle, square  lastnumber =1 " );
        double lenght =inpute.nextInt();
        double wedth=inpute.nextInt();
        int shape= inpute.nextInt();
        double area = area(lenght,wedth,shape);
        double perimeter = perimeter(lenght,wedth,shape);
        
        
    }
    //methed that caculat area to shape 
    //when shape is circle 
    public static double area(double lenght,double wedth,int shape){
        double area=0;
        switch (shape){
        case 1:
        area=lenght*wedth;
        break;
       case 2:
        area=Math.PI*lenght*lenght;
        break;}
   
    return area;}
    
    
//mehed caculate  perimeter
public static double perimeter (double lenght,double wedth,int shape){
        double perimeter =0;
        switch(shape){
        case 1:
       if(lenght==wedth)
        perimeter=lenght*4;
       else
           perimeter =2*(lenght+wedth); 
       break;
       case 2:
        perimeter=2*Math.PI*lenght;
        break;}
   
    return perimeter;}
    
    
}
