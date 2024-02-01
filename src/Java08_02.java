class Human2{
	//メンバ変数
	private String name;
	private int age;
	
	//コンストラクタ
	public Human2(String n, int a){
		name = n;
		setAge(a);//年齢の設定はメソッドに任せる

	}
	
	
	//メソッド定義
	public void introduce() {
		System.out.println("私の名前は"+name+"で、年齢は"+age+"です。");
	}
	
	public void setAge(int a) {
		if ( a < 0) {
			age =0;
		}else {
			age = a;
		}
	}
	
	public int getAge() {
		return age;
	}
}

public class Java08_02 {
	public static void main(String arms[]) {
		Human2 human1 = new Human2("太郎",-5);
		human1.introduce();
		
		//human2.age = 10;
		human1.setAge(10);
		human1.introduce();
	}
}
