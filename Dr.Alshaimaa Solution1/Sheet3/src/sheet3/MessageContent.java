/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet3;

/**
 *
 * @author yousof
 */
public class MessageContent {
    private String subject;
    private String body;
    public MessageContent(String body,String subject){
        this.subject=subject;
        this.body=body;
    }
    public MessageContent(){
    }
    public void set_subject(String subject){
    this.subject=subject;
    }
    public void set_body(String body){
    this.body=body;
    }
    public String get_subject(){
        return subject;
    }
    public String get_body(){
        return body;
    }
}
