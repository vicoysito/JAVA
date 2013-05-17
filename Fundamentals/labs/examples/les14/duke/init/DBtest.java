/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
 * Things to do:
 * 
 * Implement an sku field
 * Rewrite DukesDB to use sku field
 * Implement a command line that returns items with sku's
 * 
 * Install Tomcat and write jsp code?
 * 
 * 
 * 
 */
package duke.init;

import duke.item.Searchable;
import java.util.*;

/**
 *
 * @author kenny
 */
public class DBtest {
    public static void main(String[] args) {
        String newLine = String.format("%n");
        DukesDB theDB = new DukesDB();
        theDB.setupDb();
        
        if (args.length < 2) {
            String helptext = "Please add parameters in the format: " + newLine +
                    "   find <item id number>" + newLine +
                    "   OR" + newLine +
                    "   remove <sku> <number to remove>";

            System.out.println(helptext);
        } else {
            for (int i = 0; i < args.length; i++) {

                if (args[i].equals("find") && i + 1 < args.length) {

                    //System.out.println("found");
                    i++;
                    int itemID = Integer.parseInt(args[i]);
                    //System.out.println(itemID);
                    displayItems(theDB.findItems(itemID));
                    System.out.println();

                } else if (args[i].equals("remove") && i + 2 < args.length) {
                    i++;

                    System.out.println("Removed " + theDB.removeItem(args[i],Integer.parseInt(args[i+1])) + " items");
                    System.out.println();

                }

            }
        }
        //displayItems(theDB.findUniqueItems());

        //System.out.println(getDisplayLines(theDB.findItems()));
        
        
        //Searchable[] foundItems = theDB.findItems(); // By item type (itemID)
        //Searchable[] foundItems = theDB.findItems(DukesDB.DRESS_TROUSERS); // By item type (itemID)
        //Searchable[] foundItems = theDB.findItems("120TS"); // By SKU

        //displayItems(theDB.findItems("120TS"));
        /*
        displayItems(theDB.findItems());
        System.out.println();
        System.out.println("Removed " + theDB.removeItem("120BS", 6) + " items");
        System.out.println();
        displayItems(theDB.findItems());
        System.out.println("Removed " + theDB.removeItem("120BS", 57) + " items");
        System.out.println();
        displayItems(theDB.findItems());
         */
        
    }
    
    public static void displayItems(Searchable[] items) {
        String separatorLine = "";
        
        for (Searchable element:items) {
            String printLine = element.getDisplay(" | ");
            int length = printLine.length();
            separatorLine = new String(new char[length]).replace("\0", "-");
            System.out.println(separatorLine);
            System.out.println(element.getDisplay(" | "));

        }
        System.out.println(separatorLine);        
    }
        public static String getDisplayLines(Searchable[] items) {
            
        StringBuilder display = new StringBuilder();
        String separatorLine = "";
        String newLine = String.format("%n");
        for (Searchable element:items) {
            String printLine = element.getDisplay(" | ");
            int length = printLine.length();
            separatorLine = new String(new char[length]).replace("\0", "-");
            display.append(separatorLine).append(newLine);
            display.append(element.getDisplay(" | ")).append(newLine);

        }
        display.append(separatorLine).append(newLine);
        return display.toString();
    }
    
}
