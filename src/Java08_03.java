
public class Java08_03 {
	public static void main(String main[]) {
		overload test = new overload();
		
		test.func();
		test.func(10);
		test.func(10,20);
		test.func("test");
	}
}

class overload{
	
	//引数なし
	void func() {
		System.out.println("引数なしメソッド");
	}
	
	//int型引数1個
	void func(int a) {
		System.out.println("int型の引数1個メソッド");
	}
	
	//int型引数2個
	void func(int a,int b) {
		System.out.println("int型の引数2個メソッド");
	}
		
	//String型引数1個
	void func(String a) {
		System.out.println("String型の引数1個メソッド");
	}
}