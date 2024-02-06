class testtest{
	private static int var1 = 20;
	
	public void decrease(String name, testtest obj) {
		
		synchronized(obj){
			try { 
				
				    var1--;
				    System.out.print("var1 ="+ var1);
				    Thread.sleep(1000);
				
				 
			}catch(InterruptedException e) {
			    System.out.println(e);
			}finally{
			    System.out.println(" "+name+"の処理が終了");
			}
		}
	}
}

class testtest2 extends Thread{
	testtest obj = null;
    String name;
	
    testtest2(testtest obj, String name){
		this.obj = obj;
		this.name = name;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++){
		    obj.decrease(name, obj);
		}
	}
}

public class Java14_04 {
	public static void main(String args[]) {
		testtest obj = new testtest();
	    testtest2 tt1 = new testtest2(obj, "A");
	    testtest2 tt2 = new testtest2(obj, "B");
	    testtest2 tt3 = new testtest2(obj, "C");
	    testtest2 tt4 = new testtest2(obj, "D");
		
	    System.out.println("開始");
		
	    tt1.start();
	    tt2.start();
	    tt3.start();
	    tt4.start();
		
		try{
		    tt1.join();
		    tt2.join();
		    tt3.join();
		    tt4.join();
		}catch(InterruptedException e){}
	    System.out.println("終了");
	}
}