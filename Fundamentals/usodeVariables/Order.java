/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victordespinosavazquez
 */
public class Order {
    
    long orderValue = 0L;
    int itemQuantity = 10000000, itemPrice = 555500;
    
    public void calculateTotal(){
    
        orderValue = itemQuantity *  itemPrice;
        System.out.println("Order total: "+ orderValue);
    }
    
    
}
