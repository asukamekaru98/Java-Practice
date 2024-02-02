class Triangle{
	private double dTeihen = 0;
	private double dTakasa = 0;
	
	//コンストラクタ
	public Triangle(double getTeihen,double getTakasa){
		//init
		this.dTeihen = getTeihen;
		this.dTakasa = getTakasa;
	}
	
	public double CulcTriangle() {
		
		double result;
		
		result = dTeihen * dTakasa / 2;
		
		return result;
	}
}


public class Ex08_01 {
	public static void main(String args[]) {
		Triangle clsTriangle = new Triangle(3.5,5.2);
		
		System.out.println(clsTriangle.CulcTriangle());
	}
}
