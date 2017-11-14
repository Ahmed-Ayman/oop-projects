/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet5;

/**
 *
 * @author yousof
 */
public class Student extends Person{
    private int studentID;
    private int classNo;
    public Student(int studentID,int classNo,Person p){
        super(p.getName(), p.getAddress(), 
                p.getGender(),p.getDateOfBirth());
        this.studentID=studentID;
        this.classNo=classNo;
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
    
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    public int getClassNo() {
        return classNo;
    }

    @Override
    public Date getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getStudentID() {
        return studentID;
    }
    @Override
    public String toString(){
        return super.toString()+"studentID is "+studentID+"\nclassNo is "
                +classNo+"\n";
    }
    @Override
public Student clone(){
    Student s=new Student(studentID, classNo, super.clone());
        return s;
}
    public boolean equals(Student s){
        if(s.studentID==studentID&&s.classNo==classNo
                &&s.getName()==super.getName()
                &&s.getAddress()==super.getAddress()
                &&s.getGender()==super.getGender()
                &&s.getDateOfBirth().getDay()==super.getDateOfBirth().getDay()
                &&s.getDateOfBirth().getMonth()==super.getDateOfBirth().getMonth()
                &&s.getDateOfBirth().getYear()==super.getDateOfBirth().getYear())
            return true;
        else return false;
    }
}