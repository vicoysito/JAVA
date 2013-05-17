package duke.item;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class Trousers extends Clothing implements Returnable {


  // The fits are S=Slim, R=Regular, C=Comforable, U=Unset
  private char fitCode = 'U'; // Exception if invalid color code?


  public Trousers(int itemID, String description, char colorCode, double price,  char fit, int quantityInStock) {

    super( itemID,  description,  colorCode, price, quantityInStock);

    this.fitCode = fit;
    setSku(getSku() + fit);

  }

  public String getDisplay() {
    String newLine = String.format("%n");
    String displayString = "SKU: " + getSku() + newLine +
    "Item description: " + getDescription() + newLine +
    "Item price: " + getPrice() + newLine +
    "Color code: " + getColorCode() + newLine +
    "Fit: " + getFitCode() + newLine +
    "In stock: " + getQuantityInStock();
    return displayString;
  }

  // This method displays the values for an item
  //public void display() {
//
  //  super.display();
  //  System.out.println("Fitting Code: " + getFitCode());

  //} // end of display method

    /**
     * @return the fit
     */
    public char getFitCode() {
        return fitCode;
    }

    public String doReturn() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return "Instructions for returning trousers";
    }

}
