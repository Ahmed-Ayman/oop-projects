/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet5_2;

/**
 *
 * @author yousof
 */
public class UserProfile {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private String password;
    private String gender;
    private String mobile;
    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDateOfBirth(int d, int m, int y) {
        this.dateOfBirth = new Date(d, m, y);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCountry() {
        return country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
            this.password = password;
            return true;
        } else {
            System.out.println("Password & confirm mismatch");
            return false;
        }
    }
}
