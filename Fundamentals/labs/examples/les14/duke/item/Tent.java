package duke.item;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class Tent extends Camping implements Shippable, Returnable {

  // The tent types are =Red, B=Blue, G=Green,
  public int tentSize = 0; // Exception if invalid color code?



  // No shirt size for sake of arg

  public Tent(int itemID, String description, int tentSize, double price, int quantityInStock) {
    
    super(itemID, description, price, quantityInStock);
    this.tentSize = tentSize;
    setSku("" + itemID + "P" + tentSize);

  }
  public Tent() {} ;

  // This method displays the values for an item
  public void display() {

    super.display();
    System.out.println(tentSize + " person Tent.");

  } // end of display method

    public String getShippingInstructions(){
      return "Ship " + getDescription() + " in a HUGE bag";
  }
    
    public String doReturn() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return "Instructions for returning a tent";
    }

}
