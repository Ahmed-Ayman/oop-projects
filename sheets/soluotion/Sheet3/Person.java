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
public class Person {
    private String name ;
    private String email ;
    //constructor
    public Person(String name ,String email){
    this.name=name;
    this.email=email;}
    //getter
     public String getname (){
   return name;}
     public String getemail (){
   return email;}
     //seter
     public  void setname(String name ){
     this.name=name ;}
      public void setemail(String email ){
     this.email=email ;}
    
    
}
