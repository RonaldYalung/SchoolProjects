//Author: Ronald Yalung
/*Brief Description: The code defines a SoccerPlayer class representing
 * a soccer player with properties like name, team, games played, and
 * goals scored. It provides methods to calculate the average goals per
 * game, update player information after a game, and change the player's
 * team. The TestSoccerPlayer class demonstrates these functionalities by
 * creating a player instance for Cristiano Ronaldo with Manchester United,
 * updating his goals scored for two games, calculating his average goals
 * per game, and changing his team to Al Nassr.
 */
public class soccerPlayer {
	private String _name;
    private String _team;
    private int _gamesPlayed;
    private int _goalsScored;

    public soccerPlayer(String name, String team) {
        _name = name;
        _team = team;
        _gamesPlayed = 0;
        _goalsScored = 0;
    }

    public String getName() {
        return _name;
    }

    public String getTeam() {
        return _team;
    }

    public int getGamesPlayed() {
        return _gamesPlayed;
    }

    public int getGoalsScored() {
        return _goalsScored;
    }

    public double getAverageGoalsPerGame() {
        if (_gamesPlayed == 0) {
            return 0.0;
        }
        return (double) _goalsScored / _gamesPlayed;
    }

    public void scoreGoals(int goals) {
        _gamesPlayed++;
        _goalsScored += goals;
    }

    public void setTeam(String team) {
        _team = team;
    }

    public String toString() {
        return "Name: " + _name + 
        "\nTeam: " + _team + 
        "\nGames Played: " + _gamesPlayed +
        "\nGoals Scored: " + _goalsScored;
    }
}
