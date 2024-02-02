class Mammal{
	private String name;
	private int age;
	
	public Mammal(String name,int age) {
		System.out.println("Mammalコンストラクタの呼び出し");
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println(age+"歳の"+name+"が食事をします");
	}
}

//class サブクラス extends スーパークラス
class Human3 extends Mammal{
	public Human3(String name,int age) {
		super(name,age);
		System.out.println("Humanコンストラクタの呼び出し");
	}
	
	//こいつがオーバーライドくん
	public void eat() {
		super.eat();//スーパークラスくんを呼び出すことも可能。
		
		System.out.println("お箸使って食べるよ笑");
	}
}

public class Java09_01 {
	public static void main(String args[]) {
		Human3 human = new Human3("太郎",10);
		human.eat();
	}
}
