package duke.item;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class Shirt extends Clothing {

    public Shirt (int itemID, String description, char colorCode, double price, int quantityInStock) {
      super( itemID,  description,  colorCode, price, quantityInStock);
    }

    public String getShippingInstructions(){
      return "Ship " + getDescription() + " in a small envelope";

    }
    public void doReturn() {
        System.out.println("Send it back");
    }
}
