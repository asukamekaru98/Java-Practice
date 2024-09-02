package HoopSii;

public class Java09_02 {
	public static void main(String args[]) {
		FinalClass2 fc2 = new FinalClass2();
		fc2.func();
	}
}

class FinalClass{
	final public int a = 10;
	
	final public void func() {
		System.out.println("funcメソッド");
	}
}

class FinalClass2 extends FinalClass{
	//finalメソッドはOR不可
	//final public void func() {}
}