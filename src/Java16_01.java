import java.io.IOException;

public class Java16_01 {
	public static void main(String args[]) {
		try {
			System.out.println("入力してください");
			int n = System.in.read();
			System.out.println("入力したデータ"+n);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
