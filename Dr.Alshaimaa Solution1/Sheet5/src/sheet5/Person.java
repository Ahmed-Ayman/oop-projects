/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet5;

/**
 *
 * @author yousof
 */
public class Person {
    private String name="";
    private String address="";
    private String gender="";
    private Date dateOfBirth=new Date();
    
    public Person(String name,String address,
            String gender,Date dateOfBirth){
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.dateOfBirth=new Date(dateOfBirth);
    }

    public String getAddress() {
        return address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "name is "+name+
                "\naddress is "+address+
                "\ngender is "+gender+
                "\ndate of birth is " +
                dateOfBirth.getDay()+"/"+dateOfBirth.getMonth()
                +"/"+dateOfBirth.getYear()+"\n";
    }
    @Override
    public Person clone(){
        Person p=new Person(name, address, gender, dateOfBirth);
        return p;
    }
    public  boolean equals(Person p){
        if(p.getGender()==gender&&p.getName()==name
                &&p.getAddress()==address&&
                p.getDateOfBirth().getDay()==dateOfBirth.getDay()
                &&p.getDateOfBirth().getMonth()==dateOfBirth.getMonth()
                &&p.getDateOfBirth().getYear()==dateOfBirth.getYear())
            return true;
        else return false;
    }
}
