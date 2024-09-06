package naze_anatawa;

public class JankenMain
{
	public static void main(String args[]) {
		
		//Player PlayerTaro = new Player("太郎");
		//Player PlayerHanako = new Player("花子");
		
		Judge Referee = new Judge();
		Player murata = new Murata("あなた");
		//Tactics murataTactics = new RandomTactics();
		murata.setTactics(new CyclicTactics());
		
		Player yamada = new Yamada("山田さん");
		//Tactics yamadaTactics = new RandomTactics();
		yamada.setTactics(new RandomTactics());
		
		Referee.startJanken(murata,yamada);	
	
	}
}