package naze_anatawa_l6;

import java.util.ArrayList;

public class Master {
	private ArrayList players_ = new ArrayList();

	public void prepareGame(Hand cards) {
		System.out.println("【カードを配ります】");

		cards.shuffle();

		int numberOfCards = cards.getNumberOfCards();

		int numberOfPlayers = players_.size();

		for (int index = 0; index < numberOfCards; index++) {
			Card card = cards.pickCard();
			Player player = (Player)players_.get(index % numberOfPlayers);
			player.receoveCard(card);
		}
	}
	
	public void startGame()
	{
		System.out.println("\n【ばば抜きを開始します】");
		
		for(int count = 0;players_.size() > 1;count++) {
			int playerIndex = count % players_.size();
		}
	}
}
