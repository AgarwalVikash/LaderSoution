import java.util.Scanner;

public class PlayGame {

	public void start(Player pp1, Player pp2) {

		SnakeLadder snk1 = new SnakeLadder(pp1, pp2);
		Scanner scanner = new Scanner(System.in);
		while (!(pp1.isWinnerOrLooser() || pp2.isWinnerOrLooser())) {
			System.out.println("Chance for " + pp1.getName());
			System.out.println("Press \"ENTER\" to continue...");
			scanner.nextLine();
			int dicevalue = snk1.rollDice();
			System.out.println(pp1.getName() + " got " + dicevalue);
			snk1.nextPosition(dicevalue, pp1);
			System.out.println("Current postion for " + pp1.getName() + " is " + pp1.getCurrentPosition());
			if (pp1.getCurrentPosition() == 120) {
				pp1.setWinnerOrLooser(true);
				System.out.println("Player " + pp1.getName() + " has won the game with " + pp1.getAttempt());
				break;
			}
			System.out.println("Chance for " + pp2.getName());
			System.out.println("Press \"ENTER\" to continue...");
			scanner.nextLine();
			dicevalue = snk1.rollDice();
			System.out.println(pp2.getName() + " got " + dicevalue);
			snk1.nextPosition(dicevalue, pp2);
			System.out.println("Current postion for " + pp2.getName() + " is " + pp2.getCurrentPosition());
			if (pp2.getCurrentPosition() == 120) {
				pp2.setWinnerOrLooser(true);
				System.out.println("Player " + pp2.getName() + " has won the game with " + pp2.getAttempt());
			}
		}
		scanner.close();

	}

}
