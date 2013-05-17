/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kennys
 */
public class Team implements Comparable{

    ArrayList players;
    String name;
    int totalPoints = 0;
    int goalsInGame =0;
    int totalGoals = 0;
    int result = 0; // Could use +1 win, -1 loss, 0 draw if useful

    
    public Team(Player[] playerList, String name) {
        //players = new ArrayList(playerList);
        players = new ArrayList();
        for (int i=0; i < playerList.length; i++) {
            players.add(playerList[i]);
        }
        this.name = name;
    }
    public int compareTo(Object theTeam){

        if (this.totalPoints < ((Team)theTeam).totalPoints){
            return 1;
        }
        else {
            return -1;

        }
    }
    
    // Get players ranked by goalscoring
    public Player[] getRankedPlayers() {
        Player[] thePlayers = new Player[this.players.size()];
        this.players.toArray(thePlayers); // In order to use Arrays.sort();
        Arrays.sort(thePlayers);
        return thePlayers;
    }

}
