
public class Player {
	private int currentPosition;
	private String name;
	private int attempt = 0;

	public Player(String playerName, int position) {
		this.name = playerName;
		this.currentPosition = position;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttempt() {
		return attempt;
	}

	public void incrementAttempt() {
		this.attempt++;
	}

	public boolean isWinnerOrLooser() {
		return winnerOrLooser;
	}

	public void setWinnerOrLooser(boolean winnerOrLooser) {
		this.winnerOrLooser = winnerOrLooser;
	}

	private boolean winnerOrLooser = false;
}
