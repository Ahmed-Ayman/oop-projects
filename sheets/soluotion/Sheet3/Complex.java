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
public class Complex {
   private float real ;
   private float imaginary ;
   //consottor
   public  Complex  (){
       real=0  ;
       imaginary=0 ;}
   public  Complex (float real ,float imaginary){
   this.imaginary=imaginary;
   this.real=  real ;}
   public  Complex  (Complex c){}
   public float getreal (){
   return real;}
    public float getimaginary (){
   return imaginary;}
   //add real
   public float addReal(float r ){
   return real+= r ;
}
   public void addReal(float r ,float im ){
       real+= r ;
    imaginary+= im ;
}
   //subtract methed 
   public float subtract(float r ){
   return real-= r ;
}
   public void subtract(float r ,float im ){
       real-= r ;
    imaginary-= im ;
}
   //mulitply 
    public void mulitply(float r ){
  real*=r ;
  imaginary*= r ;
}
   public void mulitply (float r ,float im ){
     real*=r ;
  imaginary*= r ;
  real*=im ;
  imaginary*= im ;
}
   //display
   public void display(Complex x){
   System.out.println ("“real + j imaginary” such as :"+x.getreal() +"+j"+x.getimaginary());}

}
