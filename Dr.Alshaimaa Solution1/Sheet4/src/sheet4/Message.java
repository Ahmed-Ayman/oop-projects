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
public class Message {
    private String from;
    private  String to;
    private String subject;
    private ArrayList<String> body=new ArrayList<String>();
    
    public Message(String from,String to, String subject){
        this.from=from;
        this.to=to;
        setSubject(subject);
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setSubject(String subject) {
        if(subject.length()<=100)
        this.subject = subject;
        else
            System.out.println("Subject is more than 100 characters");
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }
    public void addBodyLine(String line){
        body.add(line);
    }
    public void DisplayBody(){
        for(String s :body)
        System.out.println(s);
    }
    public void clearBody(){
        body.clear();
    }
}
