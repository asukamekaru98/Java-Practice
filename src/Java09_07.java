class Mammal2{
	public void eat() {
		//ポリモーフィズム
	}
}

class Dog extends Mammal2{
	public void eat() {
		System.out.println("ドッグフードもぐもぐタイム");
	}
}

class Cat extends Mammal2{
	public void eat() {
		System.out.println("キャットフードもぐもぐタイム");
	}
}

class Human4 extends Mammal2{
	public void eat() {
		System.out.println("ヒューマンフードもぐもぐタイム");
	}
}

public class Java09_07 {
	public static void main(String args[]) {
		Mammal2 mammal[] = new Mammal2[3];
		mammal[0] = new Dog();		//
		mammal[1] = new Cat();		//
		mammal[2] = new Human4();	//
		
		for(int i = 0; i < mammal.length;i++) {
			mammal[i].eat();
		}
	}
}
