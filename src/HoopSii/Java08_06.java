package HoopSii;
class Sample{
	private int a;
	private static int b;
	
	public Sample(int aa,int bb) {
		a = aa;
		b = bb;
	}
	
	public void put() {
		System.out.println("a = "+a+" b = "+b);
	}
}


public class Java08_06 {
	public static void main(String args[]) {
		Sample test1 = new Sample(1,2);
		Sample test2 = new Sample(3,4);
		
		test1.put();
		test2.put();
	}
}
