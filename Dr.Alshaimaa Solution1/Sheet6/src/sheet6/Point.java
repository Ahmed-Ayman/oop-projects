/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet6;

/**
 *
 * @author yousof
 */
public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Point(Point p){
        x=p.x;
        y=p.y;
    }
    public void setX(int x) {
        if(x<=50)
            this.x = x;
        else
            System.out.println("Not valid !(more than 50)");
    }

    public void setY(int y) {
        if(x<=50)
            this.y = y;
        else
            System.out.println("Not valid !(more than 50)");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void move(int x,int y){
        this.x+=x;
        this.y+=y;
    }
}
