/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victordespinosavazquez
 */
public class PersonTwo {
    
    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();
    
    public void displayPersonInfo(){
    
        name.append("Fernando");
        name.append(" ");
        name.append("Gonzalez");
        
        System.out.println("Name object capacity"+ name.toString());
        System.out.println("Capacity: "+name.capacity());
        
        phoneNumber.append("5556545327");
        phoneNumber.insert(3, "-");
        phoneNumber.insert(7, "-");
        
        
        System.out.println("PHONE NUMBER:: "+ phoneNumber.toString());
        
        
    }
    
    
}
