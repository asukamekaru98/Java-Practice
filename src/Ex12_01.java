interface Copy{
	public void copy();
}

interface Scanner{
	public void scan();
}

interface Print{
	public void print();
}

 class PrinterPrinter implements Print{
	
	public String size;
	
	PrinterPrinter(String getSize){
		this.size = getSize;
	}
	
	public void print() {
		System.out.println(this.size);	
	}
}

class MultiPrinter extends PrinterPrinter implements Scanner,Copy {
	
	MultiPrinter(String getSize){
		super(getSize);
	}
	
	public void scan(){
		System.out.println("スキャン！");
	}
	
	public void copy(){
		System.out.println("コピー！");
	}
}

public class Ex12_01 {
	
	public static void main(String args[]) {
		MultiPrinter MP = new MultiPrinter("A4");
		
		MP.print();
		MP.copy();
		MP.scan();
	}
	
	
	
}