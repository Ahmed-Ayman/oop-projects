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
public class RectangleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rec1 = new Rectangle();
        Rectangle rec2= new Rectangle(3,4);
        //set lenght and wedth 
        rec1.setLenght(20);
        rec1.setwedth(30);
        //rectangle 1or 1 followed by Area – Perimeter
        System.out.println("Rectangle 1 :\n erae ="
                + rec1.getArea()+"Perimeter ="+rec1.getPerimeter());
        //Assign rec1 to rec2
        rec1.setLenght(rec2.getLenght());
        rec1.setwedth(rec2.getWedth());
        //change rec1 height to 40
        rec1.setLenght(40);
        //change rec2 height to 50
        rec2.setwedth(50);
        

    }
    
}
