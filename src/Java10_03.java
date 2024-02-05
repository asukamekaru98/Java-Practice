interface Inter{
	void method();
}

class L implements Inter{
	public void method() {
		System.out.println("Lのメソッド");
	}
}

public class Java10_03 {
	public static void main(String args[]) {
		Inter inter;
		inter = new L();
		inter.method();
	}
}
