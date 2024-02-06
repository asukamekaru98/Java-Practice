
public class Java14_01 {
	public static void main(String args[]){
		TestThread tt1 = new TestThread("スレッド1");
		TestThread tt2 = new TestThread("スレッド2");
		
		tt1.start();
		tt2.start();
		
		try {
			for(int i = 0;i < 5;i++) {
				System.out.println("メイン実行中");
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}finally {
			System.out.println("メイン終了");
		}
	}
}

class TestThread extends Thread{
	private String ThreadName;
	
	TestThread(String name){
		this.ThreadName = name;
	}
	
	public void run() {
		try {
			for(int i = 0;i < 5;i++) {
				System.out.println(ThreadName+"メイン実行中");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}finally {
			System.out.println(ThreadName+"終了");
		}
	}
}