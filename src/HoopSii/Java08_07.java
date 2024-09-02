package HoopSii;
class ThisTest{
	private int value = 20;//メンバ変数
	
	public void func() {
		int value = 10;//ローカル変数
		System.out.println("ローカル変数のvalue = "+value);
		System.out.println("メンバ変数のvalue = "+this.value);
	}
}


public class Java08_07 {
	public static void main(String args[]) {
		ThisTest test1 = new ThisTest();
		test1.func();
	}
}
