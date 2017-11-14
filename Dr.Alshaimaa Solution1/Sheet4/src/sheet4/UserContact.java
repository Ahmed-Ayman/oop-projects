/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet4;

import java.util.ArrayList;

/**
 *
 * @author yousof
 */
public class UserContact {
    private String userName;
    private String user_Email;
    private ArrayList<Message>inBox=new ArrayList<Message>();
    private ArrayList<Message>sentBox=new ArrayList<Message>();
    
    public UserContact(String userName,String user_Email){
        this.userName=userName;
        this.user_Email=user_Email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public ArrayList<Message> getInBox() {
        return inBox;
    }
    
    public void receiveMessage(Message message){
        inBox.add(message);
    }
    public void sendMessage(Message message){
        sentBox.add(message);
    }
    public void displayInBox(){
        for(Message m:inBox)
        System.out.println("From "+m.getFrom()+" - "+m.getSubject());
    }
    public void displaySendBox(){
        for(Message m:sentBox)
            System.out.println("To "+m.getTo()+" - "+m.getSubject());
    }
}
