package duke.init;




import duke.item.*;
import duke.purchase.*;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kennys
 */
public class DukesDB {
    
        static final int DRESS_SHIRT = 110;
        static final int CASUAL_SHIRT = 111;
        static final int CUSTOM_SHIRT = 112;
        static final int DRESS_TROUSERS = 120;
        static final int CASUAL_TROUSERS = 121;
        static final int DRESS_SOCKS = 130;
        static final int SPORTS_SOCKS = 131;
        static final int TENT = 310;
        static final int CAMPING_STOVE = 320;
        static final int CAMPING_STOVE_FUEL = 330;
        static final int DRESS_SUIT = 410;
        
        // List of item id's
        // Dress Shirt          110
        // Casual Shirt         111
        // Custom Shirt         112
        // Dress Trousers       120
        // Casual Trousers      121
        // Dress Socks          130
        // Sports Socks         131
        // Tent                 310
        // Camping stove        320
        // Camping stove fuel   330


  private List items = new ArrayList();
  private List selectedItems = new ArrayList();
  
    public void setupDb() {
        
        
        addItems( new Suit(DRESS_SUIT, "Dress Suit", 'B', 999.99, 'D',21 ));
        addItems( new Suit(DRESS_SUIT, "Dress Suit", 'B', 789.99, 'S',15 ));
        addItems( new Suit(DRESS_SUIT, "Dress Suit", 'G', 999.99, 'D',14 ));
        addItems( new Suit(DRESS_SUIT, "Dress Suit", 'W', 789.99, 'S',18 ));
        
        addItems( new Trousers(DRESS_TROUSERS, "Dress Trousers", 'T', 87.99, 'S',22));
        addItems( new Trousers(DRESS_TROUSERS, "Dress Trousers", 'B', 65.55, 'S',13));
        addItems( new Trousers(DRESS_TROUSERS, "Dress Trousers", 'G', 94.01, 'R',12));
        addItems( new Trousers(DRESS_TROUSERS, "Dress Trousers", 'T', 73.49, 'C',23));
        
        addItems( new Shirt(CASUAL_SHIRT, "Casual Shirt", 'R', 34.29,32));
        addItems( new Shirt(CASUAL_SHIRT, "Casual Shirt", 'R', 34.29,31));
        addItems( new Shirt(CASUAL_SHIRT, "Casual Shirt", 'B', 25.05,20));
        addItems( new Socks(SPORTS_SOCKS, "Sports Socks", 'R', 5.99,34));
        addItems( new Socks(DRESS_SOCKS, "Dress Socks", 'B', 7.99,78));
        addItems( new Tent(TENT, "Elite Tent", 3, 55.00,23));
        addItems( new Tent(TENT, "Elite Tent", 4, 65.00,23));
        addItems( new Tent(TENT, "Handypack Tent", 2, 45.00,23));
        addItems( new CampingFuel(CAMPING_STOVE_FUEL, "Smokeless camp stove fuel", 'M', 7.00,1));
        addItems( new Trousers(DRESS_TROUSERS, "Dress Trousers", 'T', 67.99, 'R',14));
        addItems( new Trousers(DRESS_TROUSERS, "Dress Trousers", 'T', 67.99, 'R',12));
        addItems( new Trousers(DRESS_TROUSERS, "Dress Trousers", 'T', 67.99, 'R',17));
        addItems( new Trousers(DRESS_TROUSERS, "Dress Trousers", 'T', 67.99, 'R',9));

       
    }

    public DukesDB() {

    }
    
    private void addItems(Searchable item ) {
        int theIndex = 0;
        // Does this item already exist?
        for (Object currItem: items) {
            if (((Searchable)currItem).getSku().equals(item.getSku())) {
                break;
            }
            theIndex++; // Final value will be arrayList size i.e. not a valid index
        }

        if (theIndex == items.size()) {
            // Didn't find an item
            items.add(item);
        } else {
            //System.out.println("Incrementing a quantity in stock");
            Searchable currItem = (Searchable)items.get(theIndex);
            currItem.setQuantityInStock(currItem.getQuantityInStock() + item.getQuantityInStock());
        }

    }

    // Ugly code!! Used for the dropdown
    public Searchable[] findUniqueItems() {
        selectedItems.clear();
        
        outer:
        for (Object element: items) {
            // if item not already in list
            for (Object selection: selectedItems) {
                if (((Searchable)element).getItemID() == ((Searchable)selection).getItemID() ) {
                    continue outer;
                } 
            }
            selectedItems.add(element);
        }

        Searchable[] foundItems = new Searchable[selectedItems.size()];
        selectedItems.toArray(foundItems);
        return foundItems;

    }
    
    // These three methods can be tidied up a lot!
    // Return all items
    public Searchable[] findItems() {
        selectedItems.clear();
        
        for (Object element: items) {
            // if item not already in list
             selectedItems.add(element);
            
        }
        Searchable[] foundItems = new Searchable[selectedItems.size()];
        selectedItems.toArray(foundItems);
        return foundItems;

    }
    
    // Return all items by Item Id
    public Searchable[] findItems(int itemId) {
        selectedItems.clear();
        
        for (Object element: items) {
            if (((Searchable)element).getItemID() == itemId) {
                // Check if one like this exists?
                selectedItems.add(element);
       
            }  
        }
        Searchable[] foundItems = new Searchable[selectedItems.size()];
        selectedItems.toArray(foundItems);
        return foundItems;

    }
    
    // Find by SKU
    public Searchable findItem(String sku) {
        Searchable foundItem = null;    // What does Effective Java say about this?
        System.out.println("list length: " + items.size());
        for (Object currItem: items) {
            if (((Searchable)currItem).getSku().equals(sku)) {              
                foundItem = (Searchable)currItem;
                break; // Should be only one element per SKU (sku like primary key)
            }
        }
        return foundItem;
    }
    
    // Throw Exception if try to remove too many items?
    // Or just return number of items removed
    public int removeItem(String sku, int numberOfItems) {
        
        int returnValue = 0; 
        int theIndex = 0;
        // Does this item  exist?
        for (Object currItem: items) {
            if (((Searchable)currItem).getSku().equals(sku)) {
                break;
            }
            theIndex++; // Final value will be arrayList size i.e. not a valid index (do/while better?)
        }
        
        if (theIndex == items.size()) {
            //System.out.println("There are no items to remove");
            return 0; // or poss throw Exception
            
        } else {
            //System.out.println("Deleting " + numberOfItems + " item(s)");
            Searchable currItem = (Searchable)items.get(theIndex);
            int quantity = currItem.getQuantityInStock();
            
            if (quantity <= numberOfItems) {  // remove the entire entry
                items.remove(theIndex);
                returnValue = quantity;

            }
            else { // enough items to remove all requested
                currItem.setQuantityInStock(currItem.getQuantityInStock() - numberOfItems);
                returnValue = numberOfItems;
            }
        }
        return returnValue;
    }
}
