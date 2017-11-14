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
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int endnum =50 ;
        prime(endnum);
        
    }
    //methe that print prime number until exact number in ascending order 
    public static void prime(int endnum){
        int i =1 ;
     while(endnum>=i){
    if(i%2!=0||i==2)
        System.out.println(i);
    i++;
    }
    }
    }

    
    

