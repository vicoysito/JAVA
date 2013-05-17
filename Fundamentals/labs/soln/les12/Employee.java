/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Employee implements Printable {
    private String name;
    private String jobTitle;
    private int employeeID;
    private int level;
    protected static int employeeIDCounter = 0;

    public void print(){
        System.out.println("Name: "+ getName());
        System.out.println("Job Title: "+ getJobTitle());
        System.out.println("Employee ID: "+ getEmployeeID());
        System.out.println("Level: "+ getLevel());
    }
    
    public void calculateEmployeeID(){
        employeeIDCounter++;  // ensuring uniqueness for the emp ID
        this.setEmployeeID(employeeIDCounter);
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return the employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

   /**
     * @param employeeID the employeeID to set
     */
    private void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    
    
    
}
