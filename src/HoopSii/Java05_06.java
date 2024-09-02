package HoopSii;
public class  Java05_06{
	public static void main(String args[]){
		int i;
		for(i = 0; i < 5; i++){
			if(i == 2)
				continue;
				System.out.println("現在処理の回数 = " + i);
		}
	}
}