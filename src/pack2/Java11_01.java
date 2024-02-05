package pack2;

class Sub extends pack1.Super{
	public Sub() {
		super();
		System.out.println("a = " + a);	
		System.out.println("b = " + b);
		//System.out.println("c = " + c);	
		//System.out.println("d = " + d);	
	}
}

public class Java11_01 {
	public static void main(String arms[]) {
		Sub sub = new Sub();
	}
}
