
public class Ex06_02 {
	public static void main(String args[]){
		double[] teihen  = {3,10,2.5};
		double[] takasa  = {4,10,8.5};
		
		for(int i = 0;i < teihen.length;i++) {
			System.out.println((i+1)+"."+(teihen[i]*takasa[i]/2)+"(cm^2)");
		}
	
	}
}
