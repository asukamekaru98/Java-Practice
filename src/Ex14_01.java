
public class Ex14_01 {
	public static void main(String args[]) {
		
		exThread exT1 = new exThread("スレッドA");
		exThread exT2 = new exThread("スレッドB");
		exThread exT3 = new exThread("スレッドC");
		Thread t1 = new Thread(exT1);
		Thread t2 = new Thread(exT2);
		Thread t3 = new Thread(exT3);
		
		
		/*
		exT1.start();
		exT2.start();
		exT3.start();
		*/
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

class exThread implements Runnable{
	private String name = null;
	
	exThread(String name){
		this.name = name;
	}
	
	public void run() {
		try {
			for(int i = 0;i < 10;i++) {
				System.out.println(name+"の"+i+"回目");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
		
		}
	}
}

/*
class exThread extends Thread{
	String name = null;
	
	exThread(String name){
		this.name = name;
	}
	
	public void run() {
		try {
			for(int i = 0;i < 10;i++) {
				System.out.println(name+"の"+i+"回目");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
		
		}
	}
}
*/