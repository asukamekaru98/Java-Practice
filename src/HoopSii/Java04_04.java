package HoopSii;

public class Java04_04 {
	public static void main(String args[]) {
		int [] array = new int[3];
			array[0] = 1;
			array[1] = 2;
			array[2] = 3;
			
			System.out.println("配列の長さ = "+ array.length);
			
			int [][] array2 = new int[2][2];
			array2[0][1] = 1;
			System.out.println(array2[0][1]);
			
			int values[] = {1,2,3};
			System.out.println(values[2]);
	}
}
