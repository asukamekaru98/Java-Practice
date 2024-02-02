
class A{
	int a;
	
	public A() {
		a = 10;
	}
}

class B extends A{
	int b;
	
	public B() {
		super();
		b = 20;
	}
}

public class Java09_05 {
	public static void main(String args[]) {
		B b = new B();
		A a = b;//引き継ぎ？
		
		System.out.println(a.a);
		
		//クラスBの変数は使えない
		//System.out.println(a.b);
		
		System.out.println(b.a);
		System.out.println(b.b);
		
		B b1 = (B)a;
		System.out.println(b1.a);
		System.out.println(b1.b);
	}
}
