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
public class Rectangle {
    private  double lenght ;
    private  double height ;
    //consturctor 
    public  Rectangle (){}
    //over load consrtructer
    public  Rectangle (double l ,double w){
    lenght =l;
    height=w;}
    //set lenght
    public void setLenght(double l){
    lenght=l ;
    }
    //set wedth 
    public void setwedth(double w){
    height=w ;
    }
    //get lenght
    public double getLenght(){
    return lenght ;
    }
    //get wedth
    public double getWedth(){
    return height;
    }
     //area methed 
   public double  getArea(){
   return lenght*height;}
   //Perimeter method
  public double getPerimeter (){
  return 2*(lenght*height);}
    
    
    
}
