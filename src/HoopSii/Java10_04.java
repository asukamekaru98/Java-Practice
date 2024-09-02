package HoopSii;
interface Police{
	void investigate();
}

//ポリ
class Policeman implements Police{
	public void investigate() {
		System.out.println("人間は聞き込みをする");
	}
}

//けいさつーぬ
class PoliceDog implements Police{
	public void investigate() {
		System.out.println("犬は匂いクンクンする");	
	}
}

public class Java10_04 {
	public static void main(String args[]) {
		Police police[] = new Police[2];
		
		police[0] = new Policeman();
		police[1] = new PoliceDog();
	
		
		
		for(int i = 0;i < police.length;i++) {
			police[i].investigate();
		}
	
	}
}
