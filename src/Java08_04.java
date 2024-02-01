public class Java08_04 {
	public static void main(String args[]) {
		
		//NoStaticClass.a = 10;
		
		NoStaticClass nsc = new NoStaticClass();
		nsc.a = 20;
		nsc.print();
		
		
		
		StaticClass.a = 10;
		StaticClass.print();
	}
}

class StaticClass{
	static int a;
	
	public static void print() {
		System.out.println("printメソッド実行:"+a);
	}
}

class NoStaticClass{
	int a;
	
	public void print() {
		System.out.println("printメソッド実行:"+a);
	}
}
