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
	
	/**
	 * ゲーム開始
	 */
	public void startGame()
	{
		System.out.println("\n【ばば抜きを開始します】");
		
		// プレイヤーの人数を取得する
		for(int count = 0;players_.size() > 1;count++) {
			int playerIndex = count % players_.size();
			int nextPlayerIndex = (count + 1) % players_.size();
			
			// 指名するプレイヤーの取得
			Player player = (Player)players_.get(playerIndex);
			
			// 次のプレイヤーの取得
			Player nextPlayer = (Player)players_.get(nextPlayerIndex);
			
			// プレイヤーを指名する
			System.out.println("\n"+player+"さんの番です");
			player.play(nextPlayer);
		}
		
		// プレイヤーが上がって残り一人になると、ループを抜ける
		System.out.println("【ババ抜きを終了しました】");
	}
	
	/**
	 * 上がりを宣言する
	 * @param winner 上がったプレイヤー
	 */
	public void declareWin(Player winner) {
		System.out.println(winner+"さんが上がりました");
		
		players_.remove(players_.indexOf(winner));
		
		if(players_.size() == 1) {
			Player loser = (Player)players_.get(0);
			System.out.println(loser+"さんの負けです");
		}
	}
	
	/**
	 * ゲームに参加するプレイヤーを登録する
	 * @param player 参加するプレイヤー＄
	 */
	public void registerPlayer(Player player) {
		players_.add(player);
	}
}
