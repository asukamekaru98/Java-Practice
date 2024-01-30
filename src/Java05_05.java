public class  Java05_05{
	public static void main(String args[]){
		int i, sum = 0;
		for(i = 0; i < 20; i++){
			sum += i;
			System.out.println("現在処理の回数 = " + i);
			System.out.println("sum = " + sum);

			if(sum > 20){
				System.out.println("sumの値が20を超えたので終了");
				break;
			}
		}
	}
}