
public class testSoccerPlayer {
	public static void main(String[] args) {
		soccerPlayer ronaldo = new soccerPlayer("Cristiano Ronaldo", "Manchester United");
        System.out.println(ronaldo);

        ronaldo.scoreGoals(3);
        System.out.println("Updated information after scoring 3 goals in one game: " + ronaldo);

        ronaldo.scoreGoals(2);
        System.out.println("Updated information after scoring 2 more goals in another game: " + ronaldo);

        System.out.println("Average goals per game: " + ronaldo.getAverageGoalsPerGame());

        System.out.println("Team: " + ronaldo.getTeam());

        ronaldo.setTeam("Al Nassr");
        System.out.println("Updated information after changing team to Al Nassr: " + ronaldo);
    }
}
