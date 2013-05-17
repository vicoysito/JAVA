
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NamesListTwo {
    public ArrayList names;
    
    public void setList(){
        names = new ArrayList();
        names.add("Joe Smith");
        names.add("Mary Palmer");
        names.add("Jose Gonzalez");
        names.add("Linda Baker");
        System.out.println("Size of ArrayList is: " + names.size());
    }
    public void displayNames(){
        System.out.println("Names in the ArrayList: ");
        for(Object name : names){
            System.out.println(name);
        }
    }    
}
