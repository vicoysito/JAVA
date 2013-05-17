/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author kennys
 */
public class Player implements Comparable {
    String name;
    int goalsScored;

    Player() {

    }
    Player(String name) {
        this.name = name;
    }
    
    public String toString() {
        return this.name;
    }

    public int compareTo(Object thePlayer){

        if (this.goalsScored < ((Player)thePlayer).goalsScored){
            return 1;
        }
        else {
            return -1;

        }
    }


}
