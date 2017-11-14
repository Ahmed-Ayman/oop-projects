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
public class ComplexTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complex a= new Complex();
         Complex b = new Complex(3.3f,4.4f);
          Complex c = new Complex(b);
          a.addReal(2f);
          b.addReal(a.getreal(), a.getimaginary());
          b.subtract(1f);
          c.subtract(b.getreal(), b.getimaginary());
          a.mulitply(3f);
          a.mulitply(c.getreal(), c.getimaginary());
          a.display(a);
          b.display(b);
          c.display(c);
          
          
          
    }
    
}
