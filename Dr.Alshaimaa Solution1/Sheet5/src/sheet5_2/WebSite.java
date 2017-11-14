/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet5_2;

import java.util.Hashtable;

/**
 *
 * @author yousof
 */
class WebSite{
   protected Hashtable <String,UserProfile> users= new Hashtable <String,UserProfile> ();
   public boolean registerUser(String firstName, String lastName, 
			int d,int m,int y, String email, String gender, 
			String mobile, String country, String password, 
			String confirmPassword){	
	if (users.get(email) ==null){
		UserProfile user= new UserProfile();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setCountry(country);
                user.setDateOfBirth(d, m, y);
                user.setGender(gender);
                user.setMobile(mobile);
                user.setEmail(email);
                
		if(user.setPassword(password,confirmPassword)){
			users.put(email, user); return true;	
		} else{
			 System.out.println("password & confirm mismatch");
                         return false; 		
		}
	} else {
		System.out.println("email already used, try another email"); 
                return false; 	
	}
   }
   public boolean login (String email, String password){	
	 UserProfile user= users.get(email) ;
	if (user ==null){
		System.out.println("User not exist");	
		return false;
	}
	 if(password.equals(user.getPassword())){
		return true;	
	}
	else 
		System.out.println("Incorrect password");	
		return false;
 	}
   }
    

