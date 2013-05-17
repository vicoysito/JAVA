
package duke.item;

public abstract class Clothing  implements Searchable, Shippable {
    private String sku = "";
    private int itemID = 0; // Default ID for all clothing items
    private String description = "-description required-"; // default
    private char colorCode = 'U'; // Exception if invalid color code?
    private double price = 0.0; // Default price for all items
    private int quantityInStock = 0;



  public Clothing(int itemID, String description, char colorCode, double price, int quantityInStock ) {
    this.itemID = itemID;
    this.description = description;
    this.colorCode = colorCode;
    this.price = price;
    this.quantityInStock = quantityInStock;
    this.sku = "" + itemID + colorCode;

  }
  public Clothing() {}

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
    
    String displayString = "SKU: " + getSku() + separator +
    "Item: " + description + separator +
    "Price: " + price + separator +
    "Color: " + colorCode + separator +
    "Available: " + quantityInStock;
    return displayString;
  }

  public String getShippingInstructions(){
      return "Ship " + description + " in a cardboard box";
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
     * @return the colorCode
     */
    public char getColorCode() {
        return colorCode;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param colorCode the colorCode to set
     */
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void applyOffer(int percentReduction) throws Exception {

      //price = price * (100.0 - percentReduction)/ 100.0;

      if (percentReduction > 90) throw new Exception("The reduction is too great!");

      price = price * (100.0 - percentReduction)/ 100.0;

      // Note this doesn't work because Math.round needs apply after price * 100
      //price *= Math.round(100.0 - percentReduction)/ 100.0;
      
      //price = price - (price * percentReduction/100);
      // round off price to 2 decimal places
      //price = Math.round(price * (100.0 - percentReduction)) / 100.0;
  }
  public double applyVoucher(double dollarsOff) {

      //price = price - dollarsOff;
      //price = Math.round((price - dollarsOff) * 100) / 100;

      price = ((price * 100) - (dollarsOff * 100)) / 100;


      return price;
      
      //return price -= 10.00;


      //price -= 5;
      //System.out.println("b4 Price is: " + (price -= 5));
      //System.out.println("next Price is: " + price);

      //if ((price -= 5) < 2) {
      //  price = 1.99;
      //}

      //price = (price -= 5) > 2?price:1.99;

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
