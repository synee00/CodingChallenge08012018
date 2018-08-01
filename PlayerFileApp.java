package co.grandcircus.fileio;

import java.util.Arrays;
import java.util.List;

public class PlayerFileApp {
	
	public static void main(String[] args) {
		List<Player> oldPlayers = PlayersFileUtil.readFile();
		for (Player player : oldPlayers) {
			System.out.println(player);
		}
		
		List<Player> players = Arrays.asList(
				new Player("Mike", 23),
				new Player("Messi", 10)
		);
		PlayersFileUtil.writeFile(players);
		
		Player player = new Player("Stanley", -4);
		PlayersFileUtil.appendLine(player);
		
		PlayersFileUtil.createDirectory(System.getProperty("user.home") + "/Desktop/hello");
		PlayersFileUtil.createBlankFile(System.getProperty("user.home") + "/Desktop/hello/hi.txt");
	}

}