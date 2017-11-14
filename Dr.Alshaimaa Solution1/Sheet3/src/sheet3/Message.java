/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet3;

/**
 *
 * @author yousof
 */
public class Message {
    private Person from=new Person();
    private Person to=new Person();
    private MessageContent content=new MessageContent();
    public Message(Person from,Person to,MessageContent content){
        this.from.set_e_mail(from.get_e_mail());
        this.from.set_name(from.get_name());
        this.to.set_name(to.get_name());
        this.to.set_e_mail(to.get_e_mail());
        this.content.set_body(content.get_body());
        this.content.set_subject(content.get_subject());
    }
    public void display(){
        System.out.println( "From : "+from.get_name()+" ( "+from.get_e_mail()+" )\n"+
                "To : "+to.get_name()+" ( "+to.get_e_mail()+" )\n"+
                "Subject : "+content.get_subject()+"\n"+
                "Body : "+content.get_body() );
    }
}
