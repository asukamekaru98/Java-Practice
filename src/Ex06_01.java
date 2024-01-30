
public class Ex06_01 {
	public static void main(String args[]){
	
		boolean b = true;
		
		for(int i = 2; i <= 100; i++) {
			b = true;
			for(int j = 2; j <= 100; j++) {
				
				//自分自身なら飛ばす
				if(i == j)continue;
				
				//割り切れた
				if(i % j == 0) {
					b = false;
					break;
				}
			}
			
			if(b == true) {
				System.out.println(i + " ");
			}
		}
	
	}
}
