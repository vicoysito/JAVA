/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Shirt {
    public int shirtID = 0; // default ID for the shirt
    public String description = "-description required-"; // default
    
    // The color codes are R=Red, B=Blue, G=Green, U=Unset
    public char colorCode = 'U';
    public double price = 0.0;  // default price for all shirts
    public int quantityInStock = 0;  // default
    
    // This method displays the values for an item
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: " + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    } // end of display method
} // end of class
