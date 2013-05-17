package duke.item;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class CampStove extends Camping implements Shippable, Returnable {

  public CampStove(int itemID, String description, double price, int quantityInStock ) {
      super(itemID, description, price, quantityInStock );
  }

    public String getShippingInstructions(){
      return "Ship " + getDescription() + " in a HUGE bag";
  }
    
    public String doReturn() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return "Instructions for returning a camp stove";
    }

}
