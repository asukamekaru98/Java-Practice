package Lesson3_2;

public class JankenMain
{
	public static void main(String args[]) {
		
		//Player PlayerTaro = new Player("太郎");
		//Player PlayerHanako = new Player("花子");
		
		Judge Referee = new Judge();
		
		Referee.startJanken(new Player("太郎"),new Player("花子"));	
	
	}
}