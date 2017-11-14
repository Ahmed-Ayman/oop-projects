/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop ;

import java.util.ArrayList;

/**
 *
 * @author g
 */
public class UserContact {
    String userName;
   String userEmailAddress;
   ArrayList<MessageSheet4>inBox=new ArrayList<>();
   ArrayList<MessageSheet4>sentBox=new ArrayList<>();
   //constructor
   public UserContact(String userName, String userEmailAddress ){
   this.userEmailAddress=userEmailAddress;
   this.userName=userName;
   }
   //
   public void receiveMessage(MessageSheet4 e){
   inBox.add(e);}
   //
   public void sendMessage(MessageSheet4 e){
  sentBox.add(e) ;}
   //DisplayInBox
   public void DisplayInBox(){
        for(MessageSheet4 message :inBox){
      System.out.println("From :"+message.getFrom()+"\nSubject : "+message.getSubject());}
      }
      //DisplaySentBox

       public void DisplaySentBox(){
        for(MessageSheet4 message :inBox){
      System.out.println("To : "+message.getTo()+"\nSubject : "+message.getSubject());}
      }
   }
   
   
   
   

