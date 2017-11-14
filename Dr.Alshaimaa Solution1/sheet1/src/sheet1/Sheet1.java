/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet1;

import javax.swing.JOptionPane;

/**
 *
 * @author yousof
 */
public class Sheet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5;
        double j=6.6;
        float z = 1.3f;
        char x='s';
        String c ="hello";
        System.out.println(a+" "+x+" "+j+" "+z+" "+c);
        j= Double.parseDouble(JOptionPane.showInputDialog("enter you scores : "));
        if(j<=100&&j>=85)
            JOptionPane.showMessageDialog(null, "Excellent");
            else if(j<85&&j>=75)
                JOptionPane.showMessageDialog(null, "V. Good");
            else if (j<75&&j>=65)
                JOptionPane.showMessageDialog(null, "Good");
            else if (j<65&&j>=50)
                JOptionPane.showMessageDialog(null, "passed");
            else 
                JOptionPane.showMessageDialog(null, "failed");
        int threeNumber[]=new int[3];
        for(int i=0;i<threeNumber.length;i++)
            threeNumber[i]=Integer.parseInt(JOptionPane.showInputDialog("enter you "+ (i+1) +" number : "));
        int max=threeNumber[0];
        if(max<threeNumber[1])
            max=threeNumber[1];
        if(max<threeNumber[2])
            max=threeNumber[2];
        JOptionPane.showMessageDialog(null, "the max number of the three is : "+max);
        for (int n=0;n<=50;n++)
            if(isPrime(n))
            System.out.print(n+" ");
        System.out.println();
        for (int m=50 ;m>=0;m--)
            if(isPrime(m))
            System.out.print(m+" ");
        System.out.println();
        for (int s=2 ; s<=50 ; s++){
            if(s%2==0)
                System.out.print(s+" ");
        }
        System.out.println();
        String threeString[]=new String[3];
        threeString[0]=JOptionPane.showInputDialog("enter first name : ");
        threeString[1]=JOptionPane.showInputDialog("enter last name : ");
        threeString[2]=JOptionPane.showInputDialog("enter age");
        for(int st=0;st<threeString.length;st++)
            System.out.println(threeString[st]);
        int toEven=Integer.parseInt(JOptionPane.showInputDialog("enter number to get even to it : "));
        for(int i=2;i<toEven;i+=2)
            System.out.print(i+" ");
        double circleRadius,rectanglength,rectangleWidth,square;
        circleRadius=Double.parseDouble(JOptionPane.showInputDialog("enter the radius : "));
        System.out.println("circle area is : "+(Math.PI*Math.pow(circleRadius,2)));
        System.out.println("circle perimeter is : "+(Math.PI*2*circleRadius));
        rectanglength= Double.parseDouble(JOptionPane.showInputDialog("enter rectangle length : "));
        rectangleWidth=Double.parseDouble(JOptionPane.showInputDialog("enter rectangle width : "));
        System.out.println("rectangle area is : "+(rectangleWidth*rectanglength));
        System.out.println("rectangle perimeter is : "+(2*(rectangleWidth+rectanglength)));
        square=Double.parseDouble(JOptionPane.showInputDialog("enter square length"));
        System.out.println("square area is : "+Math.pow(square, 2));
        System.out.println("square perimeter is : "+(4*square));
        
        lable:
        while(true){
        String operation=JOptionPane.showInputDialog("enter operation (+,-,*,/) or any other character to exit");
        if(!operation.equals("-") &&!operation.equals("*") &&!operation.equals("/") &&!operation.equals("+"))
            break lable;
        double number[]=getTwoNumbers();
        switch(operation){
            case "+" :
                System.out.println("first nuber + second number is : "+(number[0]+number[1]));break;
            case "-":
                System.out.println("first nuber - second number is : "+(number[0]-number[1]));break;
            case "*":
                System.out.println("first nuber * second number is : "+(number[0]*number[1]));break;
            case "/":
                System.out.println("first nuber / second number is : "+(number[0]/number[1]));break;
           
        }
        
        }
               
        }
    public static double []getTwoNumbers(){
        double number[]=new double[2];
        number[0]=Double.parseDouble(JOptionPane.showInputDialog("enter first number : "));
        number[1]=Double.parseDouble(JOptionPane.showInputDialog("enter second number : "));
        return number;
    }
     public static boolean isPrime(double n)
{ // returns true if n is prime,false otherwise:
double sqrtn = Math.sqrt(n);
if (n < 2) return false; // 0 and 1 are not primes
if (n < 4) return true; // 2 and 3 are the first primes
if (n%2 == 0) return false; // 2 is the only even prime
for (int d=3; d <= sqrtn; d += 2)
if (n%d == 0) return false; // n has a nontrivial divisor
return true; // n has no nontrivial divisors
}
    }
