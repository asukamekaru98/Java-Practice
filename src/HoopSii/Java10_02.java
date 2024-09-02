package HoopSii;
interface InterAA{
	int VALUE_A = 10;//勝手にpublicの定数になる
	void methodA();//勝手にpublicになる
}

interface InterBB{
	int VALUE_B = 20;//勝手にpublicの定数になる
	void methodB();//勝手にpublicになる
}

interface InterC extends InterAA,InterBB{
	int VALUE_C = 30;//勝手にpublicの定数になる
	void methodC();//勝手にpublicになる
}

class AABB implements InterC{
	public void methodA() {
		System.out.println("methodAの実装");
	}
	
	public void methodB() {
		System.out.println("methodBの実装");
	}
	
	public void methodC() {
		System.out.println("methodCの実装");
	}
}
public class Java10_02 {
	public static void main(String args[]) {
		System.out.println(AABB.VALUE_A);
		System.out.println(AABB.VALUE_B);
		System.out.println(AABB.VALUE_C);
		
		AABB ab = new AABB();
		
		ab.methodA();
		ab.methodB();
		ab.methodC();
	}
}
