
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Manager extends Employee{
    ArrayList employeeList = new ArrayList();
    
    public void setEmployee(Employee emp){
        employeeList.add(emp);
    }
    
    public ArrayList getEmployees(){
        return employeeList;
    }
    
    public void print(){
        Employee emp;
       super.print();
       System.out.println("Manager has the following employees: ");
       for (Object obj : employeeList){
           emp = (Employee)obj;
           System.out.println("\t"+ emp.getName());
       }
    }
}
