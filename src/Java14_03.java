class test{
	private static int var1 = 20;
	
	public synchronized void decrease(String name) {
		
		try { 
			    var1--;
			    System.out.print("var1 ="+ var1);
			    Thread.sleep(1000);
				
		} catch(InterruptedException e) {
			    System.out.println(e);
		}finally{
			    System.out.println(" "+name+"の処理が終了");
		}//end try
		
	}//end func
	
}//end class

class test2 extends Thread{
    test obj;
    String name;
	
    test2(test obj, String name){
		this.obj = obj;
		this.name = name;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++){
		    obj.decrease(name);
		}
		
	}//end func
	
}//end class

public class Java14_03 {
	public static void main(String args[]) {
	    test obj = new test();
	    test2 tt1 = new test2(obj, "A");
	    test2 tt2 = new test2(obj, "B");
	    test2 tt3 = new test2(obj, "C");
	    test2 tt4 = new test2(obj, "D");
		
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
		}catch(InterruptedException e){
			
		}
		
	    System.out.println("終了");
	}//end func
	
}//end class