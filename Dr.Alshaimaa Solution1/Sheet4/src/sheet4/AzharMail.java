/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author yousof
 */
public class AzharMail {

    private HashMap<String,UserContact> users=new HashMap<String,UserContact>();
    public AzharMail(UserContact userContact1,UserContact userContact2,UserContact userContact3,UserContact userContact4,UserContact userContact5){
        users.put(userContact1.getUser_Email(), userContact1);
        users.put(userContact2.getUser_Email(), userContact2);
        users.put(userContact3.getUser_Email(), userContact3);
        users.put(userContact4.getUser_Email(), userContact4);
        users.put(userContact5.getUser_Email(), userContact5);
    }
    public void sendMessage(String user_email1,String user_email2
            ,Message message){
        users.get(user_email1).sendMessage(message);
        
        users.get(user_email2).receiveMessage(message);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        UserContact userContact1=new UserContact("user1", "user@Azharian.com");
        UserContact userContact2=new UserContact("user2", "user1@Azharian.com");
        UserContact userContact3=new UserContact("user3", "user2@Azharian.com");
        UserContact userContact4=new UserContact("user4", "user3@Azharian.com");
        UserContact userContact5=new UserContact("user5", "user4@Azharian.com");
        
        AzharMail azharMail=new AzharMail(userContact1, userContact2,
                userContact3,userContact4,userContact5);
        
        Message message=new Message(userContact1.getUserName(),
                userContact2.getUserName(), "testing1");
        
        message.addBodyLine("hello "+message.getTo());
        azharMail.sendMessage(userContact1.getUser_Email(),
                userContact2.getUser_Email(), message);
        
        message=new Message(null, null, "testing2");
        message.setFrom(userContact1.getUserName());
        message.setTo(userContact3.getUserName());
        message.addBodyLine("hello "+message.getTo());
        azharMail.sendMessage(userContact1.getUser_Email(), 
                userContact3.getUser_Email(), message);
        message=new Message(null, null, "testing3");
        message.setFrom(userContact1.getUserName());
        message.setTo(userContact4.getUserName());
        message.addBodyLine("hello "+message.getTo());
        azharMail.sendMessage(userContact1.getUser_Email(),
                userContact4.getUser_Email(), message);
        message=new Message(null, null, "testing4");
        
        message.setFrom(userContact5.getUserName());
        message.setTo(userContact1.getUserName());
        message.addBodyLine("hello "+message.getTo());
        azharMail.sendMessage(userContact5.getUser_Email(),
                userContact1.getUser_Email(), message);
        message=new Message(null, null, "testing5");
        message.setTo(userContact1.getUserName());
        message.setFrom(userContact2.getUserName());
        message.addBodyLine("hello "+message.getTo());
        azharMail.sendMessage(userContact2.getUser_Email(),
                userContact1.getUser_Email(), message);
        message=new Message(null, null, "testing6");
        message.setFrom(userContact2.getUserName());
        message.setTo(userContact3.getUserName());
        message.addBodyLine("hello "+message.getTo());
        azharMail.sendMessage(userContact2.getUser_Email(),
                userContact3.getUser_Email(), message);
        
        userContact1.displayInBox();
        System.out.println();
        userContact1.displaySendBox();
        System.out.println();
        userContact3.displayInBox();
        System.out.println();
        ArrayList<Message> message1=userContact3.getInBox();
        
            message1.get(1).DisplayBody();
        
    }
}
