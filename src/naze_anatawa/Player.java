package naze_anatawa;

public class Player{
	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;
	
	private String name_;
	private int winCount_ = 0;
	
	
	public Player(String name) {
		name_ = name;
	}
	
	public int showHand() {
		
		int hand = 0;
		double randomNum = Math.random() * 3;
		
		if(randomNum < 1) {
			//System.out.println("グー");
			hand = STONE;
						
		}else if(randomNum < 2) {
			//System.out.println("チョキ");
			hand = SCISSORS;
			
		}else if(randomNum < 3) {
			//System.out.println("パー");
			hand = PAPER;
			
		}
		
		return hand;
	}
	
	public void notiftyResult(boolean result) {
		if(result) {
			winCount_++;
		}
	}
	
	public int getWinCount() {
		return winCount_;
	}
	
	public String getName() {
		return name_;
	}
	
}



