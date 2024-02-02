class ConstructorTest{

	private int value1;
	private int value2;
	
	//コンストラクタ1
	public ConstructorTest() {
		this(10,20);
		//value1 = 10;
		//value2 = 20;
	}	
	
	//コンストラクタ2
	public ConstructorTest(int value1) {
		this(value1,20);
		//this.value1 =  value1;
		//value2 = 20;
	}
	
	//コンストラクタ3
	public ConstructorTest(int value1,int value2) {		
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public void print() {
		System.out.println(this.value1);
		System.out.println(this.value2);
	}
}

public class Java08_08 {
	public static void main(String args[]) {
		ConstructorTest test1 = new ConstructorTest();
		ConstructorTest test2 = new ConstructorTest(50);
		ConstructorTest test3 = new ConstructorTest(100,200);
		
		test1.print();
		test2.print();
		test3.print();
	}

}