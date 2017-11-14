/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet3;

/**
 *
 * @author yousof
 */
public class Person {
    private String name;   
    private String e_mail;
    public Person(String name,String e_mail){
        this.name=name;
        this.e_mail=e_mail;
    }
    public Person(){
        
    }
    public void set_name(String name){
        this.name=name;
    }
    public String get_name(){
        return name;
    }
    public void set_e_mail(String e_mail){
        this.e_mail= e_mail;
    }
    public String get_e_mail(){
        return e_mail;
    }
}
