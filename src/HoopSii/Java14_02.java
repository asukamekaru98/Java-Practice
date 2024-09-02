package HoopSii;

public class Java14_02 {
	public static void main(String args[]) {
		TestRun tr = new TestRun("サブスレ");
		Thread t = new Thread(tr);
		
		t.start();
		
		try {
			for(int i = 0;i < 5;i++) {
				System.out.println("メインスレ");
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}finally {
			System.out.println("メイン終わり");
		}
	}
}

class TestRun implements Runnable{
	private String ThreadName;
	
	TestRun(String name){
		this.ThreadName = name;
	}
	
	public void run() {
		try {
			for(int i = 0;i < 5;i++) {
				System.out.println(ThreadName+"をやってるよ");
				Thread.sleep(600);
			}
		}catch(InterruptedException e) {
			
		}finally {
			System.out.println(ThreadName+"おわったよ");
		}
	}
}
