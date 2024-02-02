class X{
	
}

class Y{
	
}

public class Java09_10 {
	public static void main(String args[]) {
		Object obj[] = new Object[2];
		obj[0] = new X();
		obj[1] = new Y();
		
		for(int i = 0;i < obj.length; i++) {
			System.out.println(obj[i].getClass().getName());
		}
	}
}
