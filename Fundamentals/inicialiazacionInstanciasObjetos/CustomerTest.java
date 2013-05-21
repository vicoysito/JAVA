/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victordespinosavazquez
 */
public class CustomerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer c1,c2;
        
        c1 = new Customer();
        c2 = new Customer();
        
        
        c1.customerID=1;
        c1.emailAddress="im.vicoy@gmail.com";
        c1.name="Victor Espinosa";
        
        c2.customerID=2;
        c2.emailAddress="perez@hotmail.com";
        c2.name="Juan Perez";
        
        
    
        
        c2 = c1;
        
        c1.displayCustomerInfo();
        c2.displayCustomerInfo();
    }
}
