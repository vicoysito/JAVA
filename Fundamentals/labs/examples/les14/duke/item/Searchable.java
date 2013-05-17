package duke.item;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author kennys
 */
public interface Searchable {
    public void display();
    public double getPrice();
    public String getDescription();
    public int getItemID();
    public String getDisplay();
    public String getDisplay(String separator);
    public String getSku();
    public int getQuantityInStock();
    public void setQuantityInStock(int quantityInStock);
}
