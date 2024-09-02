package HoopSii;
interface InterA{
	int VALUE_A = 10;//勝手にpublicの定数になる
	void methodA();//勝手にpublicになる
}

interface InterB{
	int VALUE_B = 20;//勝手にpublicの定数になる
	void methodB();//勝手にpublicになる
}

class AB implements InterA,InterB{
	public void methodA() {
		System.out.println("methodAの実装");
	}
	
	public void methodB() {
		System.out.println("methodBの実装");
	}
}


public class Java10_01 {
	public static void main(String args[]) {
		System.out.println(AB.VALUE_A);
		System.out.println(AB.VALUE_B);
		
		AB ab = new AB();
	
		ab.methodA();
		ab.methodB();
	}
}
