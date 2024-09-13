package naze_anatawa_l6;

/**
 * ババ抜きのプレイヤークラス
 */
public class Player {

	/** 進行役 */
	private Master master_;
	/** テーブル */
	private Table table_;
	/** 自分の手札 */
	private Hand myHand_ = new Hand();
	/** 名前 */
	private String name_;

	/**
	 * コンストラクタ
	 * @param name 名前
	 * @param master 進行役
	 * @param table テーブル
	 */
	public Player(String name, Master master, Table table) {
		this.name_ = name;
		this.master_ = master;
		this.table_ = table;
	}

	/**
	 * 順番を指名する
	 * @param nextPlayer 次のプレイヤー
	 */
	public void play(Player nextPlayer) {
		// 次のプレイヤーに手札を出してもらう
		Hand nextHand = nextPlayer.showHand();

		// 相手の手札からカードを一枚引く
		Card pickedCard = nextHand.pickCard();

		//引いた結果を表示
		System.out.println(this + ":" + nextPlayer + "さんから" + pickedCard + "を引きました");

		//引いたカードを自分の手札に加え、同じ数のカードがあったら捨てる
		dealCard(pickedCard);

		//手札がゼロになったかどうか調べる
		if (myHand_.getNumberOfCards() == 0) {
			master_.declareWin(this);
		} else {
			System.out.println(this + ":残りの手札は" + myHand_ + "です");
		}

	}

	/**
	 * 手札を見せる
	 * @return 自分の手札
	 */
	public Hand showHand() {
		if (myHand_.getNumberOfCards() == 1) {
			master_.declareWin(this);
		}

		myHand_.shuffle();
		return myHand_;
	}

	/**
	 * カードを受け取る
	 * 
	 * @param card 受け取ったカード
	 */
	public void receoveCard(Card card) {
		dealCard(card);
	}

	/**
	 * カードを自分の手札に加え、同じ数のカードがあったら捨てる。
	 * @param card
	 */
	public void dealCard(Card card) {
		// カードを自分の手札に加える
		myHand_.addCard(card);

		// 今加えたカート同じカードを探す
		Card[] sameCards = myHand_.findSameNumberCard();

		// 同じカードの組み合わせが存在した場合
		if (sameCards != null) {
			// テーブルへカードを捨てる
			System.out.print(this + ":");
			table_.disposeCard(sameCards);
		}
	}

	/**
	 * プレイヤー名を返す
	 * ObjectクラスのtoStringメソッドをオーバーライドしたメソッド
	 * 
	 * @return プレイヤー名
	 */
	public String toString() {
		return name_;
	}
}
