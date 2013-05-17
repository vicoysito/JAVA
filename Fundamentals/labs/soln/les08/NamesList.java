
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NamesList {
    public ArrayList theList;
    
    public void setList(){
        theList = new ArrayList();
        theList.add("Joe Smith");
        theList.add("Mary Palmer");
        theList.add("Jose Gonzalez");
        theList.add("Linda Baker");
        
        System.out.println("Names List: " + theList);
        System.out.println("Size of ArrayList is: " + theList.size());
    }
    
    public void manipulateList(){
        theList.remove("Joe Smith");
        System.out.println ("Names list after removing element: " + theList);
        System.out.println ("Size of ArrayList: " + theList.size());
        theList.add(1, "Joe Smith");
        System.out.println ("Names list after adding element: " + theList);
        System.out.println ("Size of ArrayList: " + theList.size());
    }
    
}
