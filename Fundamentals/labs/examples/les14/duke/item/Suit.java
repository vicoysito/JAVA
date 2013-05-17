/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package duke.item;

/**
 *
 * @author kennys
 */
public class Suit extends Clothing implements Returnable {

  // The suit types are D = Double-breasted, S = Single-breasted, U=Unset
  private char suitType = 'U'; //

  public Suit(int itemID, String description, char colorCode, double price,  char type, int quantityInStock) {
    super( itemID,  description,  colorCode, price, quantityInStock);
    setSuitType(type);
    setSku(getSku() + type); // To create a unique SKU
  }

  public String getDisplay() {
    String newLine = String.format("%n");
    String displayString = "SKU: " + getSku() + newLine +
    "Item description: " + getDescription() + newLine +
    "Item price: " + getPrice() + newLine +
    "Color code: " + getColorCode() + newLine +
    "Type: " + getSuitType() + newLine +
    "In stock: " + getQuantityInStock();
    return displayString;
  }
  
    public String getDisplay(String separator) {
    
    String displayString = "SKU: " + getSku() + separator +
    "Item: " + getDescription() + separator +
    "Color: " + getColorCode() + separator +
    "Type: " + getSuitType() + separator +
    "Price: " + getPrice() + separator +
    
    "Available: " + getQuantityInStock();
    return displayString;
  }



    public char getSuitType() {
        return suitType;
    }

    public void setSuitType(char suitType) {
        if (suitType=='D' || suitType=='S') {
            this.suitType = suitType;

        } else {
            throw new IllegalArgumentException("The suit type must be"
                                            + " either D = Double-breasted "
                                            + "or S = Single-breasted");
        }
        
    }

    public String doReturn() {

        // In the current implementation Returnable provides
        // a marker that the item can be returned and also
        // returns conditions for returning item
        return "Suit returns must be within 3 days";
    }
}
