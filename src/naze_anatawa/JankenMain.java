package naze_anatawa;

public class JankenMain
{
	public static void main(String args[]) {
		
		//Player PlayerTaro = new Player("太郎");
		//Player PlayerHanako = new Player("花子");
		
		Judge Referee = new Judge();
		
		Referee.startJanken(new Yamada("山田"),new Murata("村田"));	
	
	}
}