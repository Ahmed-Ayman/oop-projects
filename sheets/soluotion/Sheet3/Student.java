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
public class Student {
   private String name ;
   static int numberOfStudents ;
   AzharWall wall =new AzharWall();

   
   
   //counstructor
   public Student(String name ){
       this.name= name ;
   numberOfStudents++;}
   //get name 
   public String getname(){
   return name ;}
   //chack instance 
   public  static int getnumberOfStudents(){
   return numberOfStudents;}
   public void appendMassage(String massage){
       AzharWall.wall+= getname()+":"+ massage+ "\n" ; 
   }
     public  void viewWall(){
    System.out.print(AzharWall.wall+" number of student "+Student.numberOfStudents+"\n");
    }
   
   
}
