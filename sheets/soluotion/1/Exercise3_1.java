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
public class Exercise3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int endnum =50;
        //call prime methed
        prime(endnum);
        
    }
        //methe that print prime number until exact number in descending order 

    public static void prime(int endnum){
        
        while(endnum>0){
    if(endnum%2!=0||endnum==2)
        System.out.println(endnum);
    endnum--;
    }
    }
    }
    

