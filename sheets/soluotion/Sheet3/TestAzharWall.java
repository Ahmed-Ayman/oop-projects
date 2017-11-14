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
public class TestAzharWall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Student wafaa =new Student("wafaa");
         Student aya  =new Student("aya");
         Student asmaa =new Student("asmaa");
          wafaa.appendMassage("hi :)");
          wafaa.appendMassage("how are u ? ");
          aya.appendMassage("hi :)") ;
          aya.appendMassage("iam fine :)");
          asmaa.appendMassage("hi :)");
          asmaa.appendMassage("iam fine :) ");
          wafaa.viewWall();
         
         

           
    }
    
}
