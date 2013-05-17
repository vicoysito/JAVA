package duke.item;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class CustomShirt extends Clothing {

   // Extra fields for custom made shirt
   public double neckSize  = 0;
  //public double sleeveLength  = 0;


  // No shirt size for sake of arg

  public CustomShirt(int itemID, String description, char colorCode, double price, int orders) {

    super( itemID,  description,  colorCode, price, orders);

  }

}
