/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;
import java.util.Arrays;

/**
 *
 * @author kennys
 */
public class Game {
    Team homeTeam;
    Team awayTeam;
    
    Team[] teamScored;
    Player[] playerScored;
    int[] timeScored;
    Goal[] goals;
            
    int totalNumberOfGoals;
    String gameResultMessage = "";
    
    public Game(Team team1, Team team2) {

        homeTeam = team1;
        awayTeam = team2;
        gameResultMessage = homeTeam.name + " vs. " + awayTeam.name + " ";
             
    }

    public String getResult() {
        return this.gameResultMessage;
    }

    public String getDetailedResult() {
        String newLine = String.format("%n");
        StringBuilder detailedResult = new StringBuilder();
        for (int i = 0; i < goals.length; i++) {
            detailedResult.append(goals[i].theTime);
            detailedResult.append(" | ");
            detailedResult.append(goals[i].theTeam.name);
            detailedResult.append(" | ");
            detailedResult.append(goals[i].thePlayer);
            detailedResult.append(newLine);
        }
        return detailedResult.toString();
    }
    
    public void playGame () {

        homeTeam.goalsInGame=0;
        awayTeam.goalsInGame=0;
                
        totalNumberOfGoals = (int) (Math.random()*8);
        
        goals = new Goal[totalNumberOfGoals];

        for(int i = 0; i < totalNumberOfGoals; i++) {

            goals[i] = new Goal(); // Could instantiate with time.
            goals[i].theTime = (int) (Math.random()*90);
        }

        Arrays.sort(goals);

        for(int i = 0; i < totalNumberOfGoals; i++) {

            goals[i].theTeam = (int)(Math.random()*2)==0?homeTeam:awayTeam;
            goals[i].theTeam.goalsInGame++;
            goals[i].thePlayer = (Player)(goals[i].theTeam.players).get((int)(Math.random()*homeTeam.players.size()));
            goals[i].thePlayer.goalsScored++;
        }
        setTeamPoints();
    }
    
        public void setTeamPoints() {

        if (homeTeam.goalsInGame > awayTeam.goalsInGame) {
            homeTeam.totalPoints += 3;    // 3 for a win
            // set game winner - home team wins
            homeTeam.result = 1;
        } else if (awayTeam.goalsInGame > homeTeam.goalsInGame) {
            awayTeam.totalPoints += 3;    // 3 for a win
            // set game winner - away team wins
            awayTeam.result = 1;
        }
        else {
            homeTeam.totalPoints += 1;
            awayTeam.totalPoints += 1;
            //
            // result is a draw
        }
        gameResultMessage += "( " + homeTeam.goalsInGame + " | " + awayTeam.goalsInGame + " )";

    }
}
