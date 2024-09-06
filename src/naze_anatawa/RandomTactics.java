package naze_anatawa;

public class RandomTactics implements Tactics {
	public int readTactics() {
		int hand = 0;
		double randomNum = Math.random() * 3;

		if (randomNum < 1) {
			//System.out.println("グー");
			hand = Player.STONE;

		} else if (randomNum < 2) {
			//System.out.println("チョキ");
			hand = Player.SCISSORS;

		} else if (randomNum < 3) {
			//System.out.println("パー");
			hand = Player.PAPER;

		}

		return hand;
	}

}
