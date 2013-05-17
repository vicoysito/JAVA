package duke.item;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class CampingFuel extends Camping {

  // cannister size in ml
  public char cannisterSize = 'U';  // (S)mall, (M)edium, (L)arge


  public CampingFuel(int itemID, String description, char cannisterSize, double price, int quantityInStock ) {

      super(itemID, description, price, quantityInStock );
      this.cannisterSize = cannisterSize;
      setSku("" + itemID + cannisterSize);

  }

  // This method displays the values for an item
  public void display() {

    super.display();
    System.out.println("Item size: There are " + cannisterSize + " ml of Fuel.");

  } // end of display method

}
