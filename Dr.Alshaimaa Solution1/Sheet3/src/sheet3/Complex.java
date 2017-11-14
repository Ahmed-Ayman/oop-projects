/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet3;

/**
 *
 * @author yousof
 */
public class Complex {
    double _real;
    double _imaginary;
    public Complex(){
    }
    public Complex(double _real,double _imaginary){
        this._real=_real;
        this._imaginary=_imaginary;
    }
    public Complex(Complex complex){
        _real=complex._real;
        _imaginary=complex._imaginary;
    }
    public void adding(double real){
        _real+=real;
    }
    public static void adding(Complex from,Complex to){
        to._imaginary+=from._imaginary;
        to._real+=from._real;
    }
    public void subtract (double real){
        _real-=real;
    }
    public static void subtract (Complex from,Complex to){
        to._imaginary-=from._imaginary;
        to._real-=from._real;
    }
    public void multiply (double real){
        _real*=real;
        _imaginary*=real;
    }
    public static void multiply (Complex from,Complex to){
        to._imaginary*=from._imaginary;
        to._real*=from._real;
    }
    public static String display(Complex complex){
        return complex._real+" + j"+complex._imaginary;
    }
}
