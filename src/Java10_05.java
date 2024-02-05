interface LAN{
	
}

class PC implements LAN{
	
}

class Printer implements LAN{
	
}

public class Java10_05 {
	public static void main(String args[]) {
		LAN lan[] = new LAN[2];
		lan[0] = new PC();
		lan[1] = new Printer();
		
		for(int i = 0; i< lan.length;i++) {
			if(lan[i] instanceof PC) {
				System.out.println("パソコンです");	
			}else {
				System.out.println("プリンタです");	
			}
		}
	}
}
