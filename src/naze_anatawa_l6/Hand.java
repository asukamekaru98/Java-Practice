package naze_anatawa_l6;

import java.util.ArrayList;

/**
 * ババ抜きの手札を表すクラス
 */
public class Hand {
	/** 手札にあるカードを保持するためのリスト */
	private ArrayList hand_ = new ArrayList();

	/**
	 * カードを加える
	 * 
	 * @param card 加えるカード
	 */
	public void addCard(Card card) {
		hand_.add(card);
	}

	/**
	 * カードを引く
	 * 
	 * @return 引いたカード
	 */
	public Card pickCard() {
		Card pickedCard = (Card) hand_.remove(0);
		return pickedCard;
	}

	/**
	 * シャッフルする
	 */
	public void shuffle() {
		int number = hand_.size();

		int pos;

		// カードをランダムに抜き取って最後に加える動作を繰り返す
		for (int count = 0; count < number * 2; count++) {
			pos = (int) (Math.random() * number);
			Card pickedCard = (Card) hand_.remove(pos);

			hand_.add(pickedCard);
		}
	}

	/**
	 * 枚数を数える
	 * @return 手札にあるカードの枚数
	 */
	public int getNumberOfCards() {
		return hand_.size();
	}

	/**
	 * 同じ数のカードを探す
	 * 同じ数のカードが無い場合はnullを返す
	 * 
	 * @return 同じ数のカード
	 */
	public Card[] findSameNumberCard() {
		int numberOfCards = hand_.size();
		Card[] sameCards = null;

		//手札にカードが1枚もない場合は何もしない
		if (numberOfCards > 0) {

			//最後に追加されたカードを取得する
			int lastIndex = numberOfCards - 1;
			Card lastAddedCard = (Card) hand_.get(lastIndex);

			//最後に追加されたカードの数字を取得する
			int lastAddedCardNum = lastAddedCard.getNumber();

			for (int index = 0; index < lastIndex; index++) {
				Card card = (Card) hand_.get(index);
				if (card.getNumber() == lastAddedCardNum) {
					// 最後に追加されたカードと同じカードが見つかった場合
					// 見つかった組み合わせをsameCardsに格納し、ループを抜ける
					sameCards = new Card[2];
					sameCards[0] = (Card) hand_.remove(lastIndex);
					sameCards[1] = (Card) hand_.remove(index);

					break;
				}
			}
		}
		return sameCards;
	}

	public String toString() {
		StringBuffer string = new StringBuffer();

		int size = hand_.size();
		if (size > 0) {
			for (int index = 0; index < size; index++) {
				Card card = (Card) hand_.get(index);
				string.append(card);
				string.append(" ");
			}
		}
		return string.toString();
	}

}
