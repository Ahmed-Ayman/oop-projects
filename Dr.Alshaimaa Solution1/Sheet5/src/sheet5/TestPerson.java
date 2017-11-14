/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet5;

/**
 *
 * @author yousof
 */
public class TestPerson {

    /**
     * @param args the command line arguments
     */
    public  void main(String[] args) {
        // TODO code application logic here
        Date date=new Date();
        Person person1=new Person("name1", "address1", "gender1", date);
        Person person2=new Person("name2", "address2", "gender2", date);
        
        Employee employee1=new Employee("role1", "department1", person1);
        Employee employee2=new Employee("role2", "department2", person2);
        System.out.println(employee1.equals(employee2));
        System.out.println();
        
        Employee employee3=employee1.clone();
        System.out.println(employee1);
        System.out.println();
        System.out.println(employee2);
        System.out.println();
        System.out.println(employee3);
        System.out.println();
        
        Student student1=new Student(1, 2, person1);
        Student student2=new Student(2, 2, person2);
        System.out.println(student1.equals(student2));
        Student student3=student1.clone();
        System.out.println(student1);
        System.out.println();
        System.out.println(student2);
        System.out.println();
        System.out.println(student3);
    }
}
