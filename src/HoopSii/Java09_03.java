package HoopSii;
class Super{
	public int a;
	protected int b;
	private int c;
	int d;
	
	//コンストラクタ
	public Super() {
		System.out.println("Superコンストラクタ");
		a = b = c = d = 10;
	}
}

class Sub extends Super{
	public Sub() {
		super();
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//↓これだけエラー
		//System.out.println("c="+c);
		
		System.out.println("d="+d);
	}
}


public class Java09_03 {
	public static void main(String args[]) {
		Sub sub = new Sub();
	}
}
