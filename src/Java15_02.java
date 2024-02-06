import java.util.Random;

public class Java15_02 {
	public static void main(String args[]) {
		Random random_int = new Random();
		
		for(int i = 0; i < 5; i++) {
			System.out.println(random_int.nextInt());
		}
	}
}
