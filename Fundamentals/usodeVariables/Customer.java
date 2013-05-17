/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victordespinosavazquez
 */
public class Customer {
    
    int customerID = 0; // Default ID for a customer
    char status = 'N';
    double totalPurchases = 0.0;
    String salto = "*******************************";
    
    
    public void displayCustomerInfo(){
            System.out.println(salto);
            System.out.println("Customer ID:"+ customerID);
            System.out.println("Customer Status:"+ status);
            System.out.println("Customer Total Puchases:"+ totalPurchases);
            System.out.println(salto);
    }
    
    
    
    
    
    }

