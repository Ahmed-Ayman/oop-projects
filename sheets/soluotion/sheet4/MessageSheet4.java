/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;

/**
 *
 * @author g
 */
public class MessageSheet4 {
      private String From ;
      private  String To ;
      private String Subject ;
    ArrayList <String> Body = new ArrayList<>() ;
    //constructor
    public MessageSheet4( String From ,String To , String Subject ){
     this.From =From ;
     this.To =To ;
      if(Subject.length()<100)
        this.Subject=Subject ;
    else 
        System.out.print("Subject must be 100 char or less");
    }
    //setFrom
    public void setFrom(String From){
    this.From =From ;}
    //setTo
    public void setTo(String To){
    this.To =To ;}
    //setSubject
    public void setSubject(String Subject){
    if(Subject.length()<100)
        this.Subject=Subject ;
    else 
        System.out.print("Subject must be 100 char or less");
        }
    //getFrom
    public String getFrom(){
    return From;}
    //getTo
     public String getTo(){
    return To ;}
     //getSubject
      public String getSubject(){
    return Subject ;}
     // addBodyline
      public  void addBodyline (String line){
          Body.add(line);
      }
      //DisplayBody
      public void DisplayBody(){
      for(String message :Body){
      System.out.println(message);}
      }
}
