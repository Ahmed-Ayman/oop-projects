/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.HashMap;

/**
 *
 * @author g
 */
public class AzharMail {
   
       static HashMap<String,UserContact> users=new HashMap<>();
     //constructor 
     public AzharMail(){
         UserContact me  = new UserContact("1","1@alazhr");
         UserContact friend1  = new UserContact("2","2@alazhr");
         UserContact friend2 = new UserContact("3","3@alazhr");
         UserContact friend3   = new UserContact("4","4@alzhr");
         UserContact friend4  = new UserContact("5","5@alazhr");
         
   users.put(me.userEmailAddress,me );
   users.put(friend1.userEmailAddress,friend2 );
   users.put(friend2.userEmailAddress,friend2 );
   users.put(friend3.userEmailAddress, friend2);
   users.put(friend4.userEmailAddress, friend2);
   
     }
     
     //sendMessage
     public   static void sendMessage(String from ,String to ,MessageSheet4 massage){
   UserContact From = users.get(from);
   UserContact To = users.get(to);
   To.receiveMessage(massage);
   From.sendMessage(massage);
     }
     //main 
     //Dr. Alsmimaa said there is a problem  with with class so it will get unexpected outpute 
      public   static void main(String[] args) {
        // TODO code application logic here
        AzharMail azhary = new AzharMail();
        MessageSheet4 massage;
         massage = new MessageSheet4(null,null,"OOP");
          MessageSheet4 massage2;
         massage2 = new MessageSheet4(null,null,"signal");
        AzharMail.sendMessage("1@alazhr","3@alazhr",massage);
        AzharMail.sendMessage("1@alazhr","3@alazhr",massage2);
         sendMessage("5@alazhr","1@alazhr",massage);
         sendMessage("1@alazhr","3@alazhr",massage);
        users.get("3@alazhr").DisplayInBox();
        users.get("3@alazhr").DisplaySentBox();
        users.get("1@alazhr").DisplayInBox();
        users.get("1@alazhr").DisplaySentBox();
        users.get("5@alazhr").DisplayInBox();
        users.get("5@alazhr").DisplaySentBox();
        
                
        
                }
}

