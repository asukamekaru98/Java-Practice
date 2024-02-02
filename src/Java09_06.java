class C{
	public void print() {
		System.out.println("クラスCです");

	}
}

class D extends C{
	public void print() {
		System.out.println("クラスDです");

	}
}

public class Java09_06 {
	public static void main(String args[]) {
		D d1 = new D();
		C c = d1;
		
		c.print();
		
		D d2 = (D)c;
		d2.print();
		
		
	}
}
