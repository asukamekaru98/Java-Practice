
public class Java15_03 {
	public static void main(String args[]) {
		
		Integer num1 = new Integer(100);
		Integer num2 = Integer.valueOf("200");
		String num3 = "300";
		
		int i_num1 = num1.intValue();
		int i_num2 = num2.intValue();
		int i_num3 = Integer.parseInt(num3);
		
		System.out.println(i_num1);
		System.out.println(i_num2);
		System.out.println(i_num3);
	}
}
