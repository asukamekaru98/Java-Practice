
class Value{
	private int value;
	
	public Value(int value) {
		setValue(value);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}

public class Java08_09 {
	public static void main(String args[]) {
			int value1 = 10;
			Value value2 = new Value(10);
			
			put(value1,value2);
			change(value1,value2);// 値渡しと参照渡し
			put(value1,value2);
			
		}
		
		private static void change(int value1,Value value2) {
			value1 = 20;
			value2.setValue(20);
		}
		
		private static void put(int value1,Value value2) {
			System.out.print("基本データ型の値:"+value1);
			System.out.println("オブジェクトの値:"+value2.getValue());
		}
	
}
