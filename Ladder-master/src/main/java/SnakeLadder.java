
import java.util.HashMap;
import java.util.Map;

public class SnakeLadder {

	private Map<Integer, Integer> snakeLadder = new HashMap<Integer, Integer>();
	int winposition = 120;
	private Player p;
	private Player p2;

	public Player getP() {
		return p;
	}

	public void setP(Player p) {
		this.p = p;
	}

	public SnakeLadder() {

	}

	public SnakeLadder(Player pp1, Player pp2) {
		p = pp1;
		p2 = pp2;
		snakeLadder.put(3, 43);
		snakeLadder.put(15, 49);
		snakeLadder.put(8, 14);
		snakeLadder.put(43, 101);
		snakeLadder.put(74, 93);
		snakeLadder.put(76, 106);
		snakeLadder.put(62, 82);
		snakeLadder.put(98, 119);
		snakeLadder.put(71, 14);
		snakeLadder.put(101, 65);
		snakeLadder.put(78, 40);
		snakeLadder.put(111, 75);
		snakeLadder.put(84, 57);
		snakeLadder.put(114, 94);
		snakeLadder.put(67, 44);
		// TODO Auto-generated constructor stub
	}

	public int rollDice() {
		return 1 + (int) (Math.random() * 5);
	}

	public void nextPosition(int diceValue, Player currentPlayer) {
		int temp = diceValue + currentPlayer.getCurrentPosition();
		if (snakeLadder.containsKey(temp)) {
			currentPlayer.setCurrentPosition(snakeLadder.get(temp));
		} else if (winposition >= temp) {
			currentPlayer.setCurrentPosition(currentPlayer.getCurrentPosition() + diceValue);
		}
		currentPlayer.incrementAttempt();
	}

	public Player getP2() {
		return p2;
	}

	public void setP2(Player p2) {
		this.p2 = p2;
	}
}
