
public class FootballScoreStats {

	public int teamTotal(String teamName) {
		int total = 0;
		Game[] played = getAllPlayed();
		for (Game game : played) {
			if(game.getHomeTeam().equals(teamName)){
				total += game.getHomeTeamScore();
			}
			if(game.getAwayTeam().equals(teamName)){
				total += game.getAwayTeamScore();
			}
		}
		return total;
	}

	private Game[] getAllPlayed() {
		Game[] played = new Game[3];
		played[0] = new Game("Liverpool", 2, "Everton", 0);
		played[1] = new Game("Aston Villa", 1, "Liverpool", 1);
		played[2] = new Game("Liverpool", 3, "West Ham", 1);
		return played;
	}

}
