package duke.purchase;




import duke.item.Searchable;
import duke.item.Shippable;
import java.util.*;
import duke.purchase.Order;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class Shipping {

  public List items = new ArrayList();

  public Shipping(Order order) {

      items = order.getList();
      
  }

  
  public double addItem(Searchable theItem) {
      // Don't worry about the number yet
      items.add(theItem);

      /* // a list of serializable
      System.out.println("Writing out the List");
      try {
          java.io.ObjectOutputStream theOO = new java.io.ObjectOutputStream(System.out);
          theOO.writeObject(items); }
      catch (Exception e) {
          System.out.println("***** Some class of an error ******");
      }
       * 
       */
      
      return items.size() * theItem.getPrice(); // Not correct

  }
  public void getInstructions() {
          //get an Iterator object for ArrayList using iterator() method.
    ListIterator itr = items.listIterator();
System.out.println ("Size to iterate is: " + items.size());
    //use hasNext() and next() methods of Iterator to iterate through the elements
    System.out.println("Iterating through ArrayList elements...");

    Searchable currItem = null;
    while(itr.hasNext()){
       //itr.next();
    //ISearchable currItem = new Tent(123, "Arch", 3, 5.00, 3);

        
    //System.out.println(itr.next());
           
        currItem = (Searchable)itr.next();
    //System.out.println("Current index is: " + items.);
        
        if (currItem instanceof Shippable) {
            System.out.println(((Shippable)currItem).getShippingInstructions());
            //currItem.display();
      } else {
        System.out.println("** " + currItem.getDescription() + " cannot be shipped. **");
      }
        //currItem.display();
    
      }
  }
}



