/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet3;

/**
 *
 * @author yousof
 */
public class AzharWall {
    private static String _wall;
    public static void set_message(String message){
        if(_wall == null)
            _wall= message;
        else
        _wall=_wall+ "\n" + message ;
    }
    public static String get_message(){
        return _wall;
    }
}
