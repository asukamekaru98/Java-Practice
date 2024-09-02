package HoopSii;

public class Java13_03 {
	public static void main (String args[]) {
		try {
			meth1();
		}catch (NullPointerException e) {
			 System.out.println("お゛あ゛あ゛あ゛あ゛あ゛あ゛あ゛あ゛あ゛あ゛あ゛あ゛!!!!!!!!!!!!!! : "+e.getMessage());
		}
	}
	
	public static void meth1() {
		throw new NullPointerException("ﾃｽﾃｨﾝｸﾞ");
	}
}
