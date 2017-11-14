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
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1; //decrele
        number1 = 1;//Initialize
        double number2;
        number2 = 4;
        float number3;
        number3 = 8;
        String name;
        name = "wafaa";
        char v;
        v = 'v';
        //call print methed
        print(number1, number2, number3, name, v);
    }

    //print methed that print variables 

    public static void print(int number1, double number2, float number3, String name, char v) {
        System.out.println("number 1 =" + number1 + "\nnumber 2 = " + number2
                + "\nnumber 3 = " + "" + number3 + "\nname is " + name + "\nchar is " + v);
    }
}
