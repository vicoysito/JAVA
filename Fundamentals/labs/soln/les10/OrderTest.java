/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class OrderTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Order order = new Order();
        Shirt shirt = new Shirt(), shirt2 = new Shirt(), shirt3 = new Shirt();
        double totalCost = 0.0;
        
        shirt.price = 14.99;
        shirt2.price = 23.55;
        shirt3.price = 49.99;
        totalCost = order.addShirt(shirt);
        totalCost = order.addShirt(shirt2);
        totalCost = order.addShirt(shirt3);
        System.out.println("Total amount for the order is $" + totalCost);
    }
}
