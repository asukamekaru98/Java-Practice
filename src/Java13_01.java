
public class Java13_01 {
	/*public static void main(String args[]) {
		func();
	}
	
	public static void func() {
		int array[] = new int[5];
		
		try {
			for(int i = 0; i < 10; i++) {
				array[i] = i;
				System.out.println(array[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外"+e);
		}finally {
			System.out.println("ぐひょひょ");
		}
	}*/
	
	public static void main(String args[]) {
		try {
			func();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外"+e);
		}finally {
			System.out.println("ぐひょひょ");
		}
		
	}
	
	public static void func() {
		int array[] = new int[5];
		

		for(int i = 0; i < 10; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}

	}
}
