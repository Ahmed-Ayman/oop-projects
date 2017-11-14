/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet6;

/**
 *
 * @author yousof
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a[]=new Animal[50];
        int j=1;
        for (int i = 0; i < 10; i++,j++) {
            a[i]=new Mouse("m"+j, randomDirection(), 
                    new Point(i, i));
        }
        j=1;
        for (int i = 10; i < 17; i++,j++) {
            a[i]=new Cat("c"+j, randomDirection(),
                    new Point(i, i));
        }
        j=1;
        for (int i = 17; i < 22; i++,j++) {
            a[i]=new Dog("d"+j, randomDirection(),
                    new Point(i,i));
        }
        for (int i = 0; i < 200; i++) {
            for (int k = 0; k < 22; k++) {
                a[k].forward();
            }
        }
        for (int i = 0; i < 22; i++) {
            System.out.println(a[i].toString());
            System.out.println();
        }
    }
    private static String randomDirection(){
       int z= (int)(Math.random()*4);
       switch(z){
           case 0:return "north";
           case 1:return "east";
           case 2:return "west";
           case 3:return "south";
           default:return "UN RECHABLE CODE!";
       }
    }
    private static int random50Max(){
        return (int)(Math.random()*50);
    }
}
