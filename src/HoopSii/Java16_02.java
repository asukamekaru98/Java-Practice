package HoopSii;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java16_02 {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("入力してください");
			
			String s = br.readLine();
			
			System.out.println("入力したデータ"+ s);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
