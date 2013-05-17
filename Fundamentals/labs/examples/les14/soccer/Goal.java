/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author kennys
 */
public class Goal implements Comparable {

    Team theTeam;
    Player thePlayer;
    int theTime;


    public int compareTo(Object theGoal){

        if (this.theTime > ((Goal)theGoal).theTime){
            return 1;
        }
        else {
            return -1;

        }
    }

}
