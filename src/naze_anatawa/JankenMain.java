package naze_anatawa;

public class JankenMain
{
	public static void main(String args[]) {
		
		//Player PlayerTaro = new Player("太郎");
		//Player PlayerHanako = new Player("花子");
		
		Judge Referee = new Judge();
		Player murata = new Murata("村田さん");
		Player yamada = new Yamada("山田さん");
		
		Referee.startJanken(murata,yamada);	
	
	}
}