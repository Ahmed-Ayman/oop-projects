
package sheet5;

/**
 *
 * @author yousof
 */
public class Employee extends Person{
    private String role;
    private String department;
    public String getRole() {
        return role;
    }

    public String getDepartment() {
        return department;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public Employee(String role,String department ,Person p){
         super(p.getName(), p.getAddress(),
                p.getGender(), p.getDateOfBirth());
        this.role=role;
        this.department=department;
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
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
    @Override
    public String toString(){
        return super.toString()+"role is "+role
                +"\ndepartment is "+department+"\n";
    }
    public boolean equals(Employee e){
        if(e.getRole()==role&&e.getDepartment()==department
                &&e.getName()==super.getName()
                &&e.getAddress()==super.getAddress()
                &&e.getGender()==super.getGender()
                &&e.getDateOfBirth().getDay()==super.getDateOfBirth().getDay()
                &&e.getDateOfBirth().getMonth()==super.getDateOfBirth().getMonth()
                &&e.getDateOfBirth().getYear()==super.getDateOfBirth().getYear())
            return true;
        else return false;
    }
    @Override
    public Employee clone(){
        Employee e=new Employee(role, department,super.clone());
        return e;
    }
}
