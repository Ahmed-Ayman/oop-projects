/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet5;

/**
 *
 * @author yousof
 */
public class Date {
    private int day, month, year; 
	Date (){
		day = 1;
		month= 1;
		year= 2013;
	}
   	Date (int d, int m, int y){
		 day = d;
		month= m;
		year= y ;
     	}
	Date (Date  a){
		 day = a.day;
		month= a.month;
		year= a.year; 
	}

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

}
