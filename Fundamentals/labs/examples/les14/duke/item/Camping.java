package duke.item;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class Camping implements Searchable {
  private String sku = "";
  private int itemID = 0; // Default ID for the shirt
  private String description = "-description required-"; // default
  private double price = 0.0; // Default price for all items
  private int quantityInStock = 0;

  // No shirt size for sake of arg

  public Camping(int itemID, String description, double price, int quantityInStock) {
    this.sku = "" + itemID;
    this.itemID = itemID;
    this.description = description;
    this.price = price;
    this.quantityInStock = quantityInStock;

  }
  public Camping() {} ;

  public double getPrice() {
      return price;
  }

  public void display() {

    System.out.println(getDisplay());

  } // end of display method
  
  public String getDisplay() {
      String newLine = String.format("%n");
      return getDisplay(newLine);
      
  }
  public String getDisplay(String separator) {
    String newLine = String.format("%n");
    String displayString = "SKU: " + getSku() + separator +
    "Item: " + description + separator +
    "Price: " + price + separator +
    "Available: " + quantityInStock;
            ;
    return displayString;
  }

  public String getDescription(){
      return description;
  }

    /**
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * @return the quantityInStock
     */
    public int getQuantityInStock() {
        return quantityInStock;
    }

    /**
     * @param quantityInStock the quantityInStock to set
     */
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    /**
     * @return the sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * @param sku the sku to set
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

}
