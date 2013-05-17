package duke.purchase;




import duke.item.Searchable;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class Order {
  public long orderValue = 0;
  public int itemQuantity = 1000000;
  public int itemPrice = 555500;

  public List items = new ArrayList();

  public void calculateTotal() {

  orderValue = (long) itemQuantity * itemPrice;

    System.out.println("The result is " + orderValue);

    } // end calculateTotal
/*
  public void addShirt(Shirt theShirt, int numberOfShirts) {

      items.add(theShirt);

  }
    // Overloaded so don't have to worry about the number yet
    public double addShirt(Shirt theShirt) {
      // Don't worry about the number yet
      items.add(theShirt);
      return items.size() * theShirt.price;

  }
 *
 */

      // More general for any item, overloaded so don't have to worry about the number yet
      // Shouldn't return anything surely
    public double addItem(Searchable theItem) {
      // Don't worry about the number yet
      items.add(theItem);
      return items.size() * theItem.getPrice(); // Not correct

  }
    public List getList(){
            return items;
    }


}
