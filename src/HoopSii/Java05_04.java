package HoopSii;

public class Java05_04 {
	public static void main(String args[]){
		for(int i = 0; i < 5; i++){
			switch (i) {
				case 0:
					System.out.println("iの値は0です");
					break;
				case 1:
					System.out.println("iの値は1です");
					break;
				case 3:
					System.out.println("iの値は3です");
					break;
				default:
					System.out.println("iは値は0,1,3以外です");
			}
		}
	}
}
