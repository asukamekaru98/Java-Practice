package naze_anatawa_l2;

public class Judge {
	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

	public void startJanken(Player player1, Player player2) {

		System.out.println("【ジャンケン開始】\n");

		for (int i = 0; i < 3; i++) {
			System.out.println("【" + (i + 1) + "回戦目】\n");

			Player winner = judgeJanken(player1, player2);
			if (winner == null) {
				System.out.println("引き分けです\n");
			} else {
				System.out.println(winner.getName() + "が勝ちました\n");
			}

		}

		System.out.println("【ジャンケン終了】\n");

		Player finalWinner = judgeFinalWinner(player1, player2);

		System.out.println(player1.getWinCount() + "対" + player2.getWinCount() + "で、");

		if (finalWinner == null) {
			System.out.println("引き分けです\n");
		} else {
			System.out.println(finalWinner.getName() + "の勝ちです\n");
		}

	}

	private Player judgeJanken(Player player1, Player player2) {

		//Player winner = null;
		int player1Hand = player1.showHand();
		int player2Hand = player2.showHand();

		printHand(player1Hand);
		System.out.println("vs.");
		printHand(player2Hand);
		System.out.println("\n");

		if ((player1Hand == STONE && player2Hand == SCISSORS) ||
				(player1Hand == SCISSORS && player2Hand == PAPER) ||
				(player1Hand == PAPER && player2Hand == STONE)) {

			player1.notiftyResult(true);			
			return player1;

		} else if ((player1Hand == STONE && player2Hand == PAPER) ||
				(player1Hand == SCISSORS && player2Hand == STONE) ||
				(player1Hand == PAPER && player2Hand == SCISSORS)) {

			player2.notiftyResult(true);			
			return player2;

		}

		return null;
	}
	
	private Player judgeFinalWinner(Player player1, Player player2) {
		
		int player1WinCount = player1.getWinCount();
		int player2WinCount = player2.getWinCount();
		
		
		if(player1WinCount > player2WinCount) {
			return player1;
			
		}else if(player1WinCount < player2WinCount) {
			return player2;
			
		}

		return null;
	}

	private void printHand(int hand) {
		switch (hand) {
		case Player.STONE:
			System.out.println("グー");
			break;
			
		case Player.SCISSORS:
			System.out.println("チョキ");
			break;
			
		case Player.PAPER:
			System.out.println("パー");
			break;
			
		default:
			// なにもしない
			break;
		}
	}
	/*
	public void startJanken(Player player1, Player player2) {
	
		int player1Hand, player2Hand;
	
		System.out.println("【ジャンケン開始】\n");
	
		for (int i = 0; i < 3; i++) {
			player1Hand = player1.showHand();
			player2Hand = player2.showHand();
	
			if ((player1Hand == STONE && player2Hand == SCISSORS) ||
					(player1Hand == SCISSORS && player2Hand == PAPER) ||
					(player1Hand == PAPER && player2Hand == STONE)) {
	
				player1.notiftyResult(true);
				player2.notiftyResult(false);
				System.out.println("\n"+player1.getName()+"が勝ちました\n");
	
			} else if ((player1Hand == STONE && player2Hand == PAPER) ||
					(player1Hand == SCISSORS && player2Hand == STONE) ||
					(player1Hand == PAPER && player2Hand == SCISSORS)) {
	
				player1.notiftyResult(false);
				player2.notiftyResult(true);
				System.out.println("\n"+player2.getName()+"が勝ちました\n");
	
			} else {
	
				System.out.println("\n引き分けです\n");
	
			}
		}// end for
		
		
		
		System.out.println("【ジャンケン終了】\n");
		
		int player1WinCount =  player1.getWinCount();;
		int player2WinCount =  player2.getWinCount();;
		
		if(player1WinCount > player2WinCount) {
			System.out.println(player1WinCount + "対"+player2WinCount +"で、"+player1.getName()+"の勝ちです\n");
			
		}else if(player1WinCount < player2WinCount) {
			System.out.println(player1WinCount + "対"+player2WinCount +"で、"+player2.getName()+"の勝ちです\n");
			
		}else {
			System.out.println(player1WinCount + "対"+player2WinCount +"で、引き分けです\n");
			
		}
	}
	*/
}