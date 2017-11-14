/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet5_2;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author yousof
 */
public class AzharMail extends WebSite {

    private static Hashtable<String, UserContact> users = new Hashtable<String, UserContact>();

    public AzharMail(String firstName, String lastName,
            int d, int m, int y, String email, String gender,
            String mobile, String country, String password,
            String confirmPassword) {
        if (registerUser(firstName, lastName, d, m, y, email, gender, mobile, country, password, confirmPassword)) {
            UserContact uc = new UserContact(firstName + " " + lastName, email);
            users.put(email, uc);
        }

    }

    public void addUserContact(String firstName, String lastName,
            int d, int m, int y, String email, String gender,
            String mobile, String country, String password,
            String confirmPassword) {
        if (registerUser(firstName, lastName, d, m, y, email, gender, mobile, country, password, confirmPassword)) {
            UserContact uc = new UserContact(firstName + " " + lastName, email);
            users.put(email, uc);
        }

    }

    public void sendMessage(String user_email1, String password, String user_email2, Message message) {
        if (login(user_email1, password)) {
            users.get(user_email1).sendMessage(message);

            users.get(user_email2).receiveMessage(message);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here


        AzharMail azharMail = new AzharMail("first1", "last1", 1, 1, 1990, "user1@Azharian.com", "male", "011", "cairo", "123", "123");
        azharMail.addUserContact("first2", "last2", 1, 1, 1990, "user2@Azharian.com", "male", "010", "cairo", "123", "123");
        Message message = new Message(users.get("user1@Azharian.com").getUser_Email(),
                users.get("user2@Azharian.com").getUser_Email(), "testing1");

        message.addBodyLine("hello " + message.getTo());
        azharMail.sendMessage(users.get("user1@Azharian.com").getUser_Email(), "123",
                users.get("user2@Azharian.com").getUser_Email(), message);
        users.get("user1@Azharian.com").displaySendBox();
        System.out.println();
        users.get("user2@Azharian.com").displayInBox();
        System.out.println();


    }
}
