/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet2;

/**
 *
 * @author yousof
 */
public class rectangle {
    private double _length;
    private double _height;
    public rectangle()
    {
    }
    public rectangle(double length,double height)
    {
        _length=length;
        _height=height;
    }
    public double getArea(){
        return _length*_height;
    }
    public double getPerimeter(){
        return 2*(_length+_height);
    }
    public void setLength(double length){
        _length=length;
    }
    public void setheight(double height){
        _height=height;
    }
    
}
