interface N{
	int N = 10;
	void bMethod();
}

/*
class NNN implements N{
	public void bMethod(){
		System.out.println("ホゲホゲです");	
	}
}
*/

public class Ex10_01 implements N{

	public void bMethod(){
		System.out.println("ホゲホゲです");	
	}
	
	public static void main(String args[]) {
		
		//NNN classN = new NNN();
		
		//N clsN;
		//clsN = new N();
		
		//N.bMethod();
		
		//System.out.println(classN.N);	
		
		
		Ex10_01 exInstance = new Ex10_01();
		exInstance.bMethod();
		
		System.out.println(exInstance.N);	
		
	}
	
}
