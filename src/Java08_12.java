class Obj{
	public int value;
}

public class Java08_12 {
	public static void main(String args[]) {
		Obj obj[] = new Obj[3];//この時点ではまだ宣言しただけ。
		obj[0] = new Obj();//オブジェクト作成
		obj[0].value = 10;
		//obj[3].value = 30;
		
		System.out.println("obj[0].value = "+obj[0].value);
	//	System.out.println("obj[1].value = "+obj[1].value);
		//System.out.println("obj[3].value = "+obj[3].value);
	}
}
