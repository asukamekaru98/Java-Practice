
public class Java08_01 {
	public static void main(String arms[]) {
		Human human1 = new Human("太郎",10);
		Human human2 = new Human("ホップ",99);
		
		human1.introduce();
		human2.introduce();
	}
}

class Human{
	//メンバ変数
	private String name;
	private int age;
	
	//コンストラクタ
	public Human(String n, int a){
		name = n;
		
		if(a < 0) {
			age = 0;
		}else{
			age = a;
		}
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