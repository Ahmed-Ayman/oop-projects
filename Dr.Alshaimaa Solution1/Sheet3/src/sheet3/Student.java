/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet3;

/**
 *
 * @author yousof
 */
public class Student {
    private String _name;
    private static int counter=0;
    public Student(String _name){
    this._name=_name;
    counter++;
    }
    public static String check_NO_of_objects(){
        return "Number of objects is : "+counter;
    }
    public void comment_Message(String message){
        AzharWall.set_message(_name+" : "+message);
    }
    public static String view_Wall(){
        return AzharWall.get_message()+"\n"+check_NO_of_objects();
    }
}
