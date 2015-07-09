public class LetsPlayGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We need atleast two player to play the game");
		// Player instance created for playing the game
		Player pp1 = new Player("vikash", 1);
		// Player instance created for playing the game
		Player pp2 = new Player("Prateek", 1);
		PlayGame lp = new PlayGame();
		lp.start(pp1, pp2);

	}
}
