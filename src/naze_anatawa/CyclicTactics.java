package naze_anatawa;

public class CyclicTactics implements Tactics {
	
	public int lastHand = -1;
	
	public int readTactics() {
			
		lastHand = (lastHand + 1) % 3;
	
		return lastHand;
	}
}
