package duke.item;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class Socks extends Clothing {

    public Socks (int itemID, String description, char colorCode, double price, int quantityInStock) {
      super( itemID,  description,  colorCode, price, quantityInStock);
    }

    public String getShippingInstructions(){
      return "Ship " + getDescription() + " in a small envelope";

    }
}
