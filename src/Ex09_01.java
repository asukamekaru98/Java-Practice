class Animals{
	protected int AnimalAge;
	
	public Animals(int getAge) {
		AnimalAge = getAge;
	}
	
	public void Walk() {
		System.out.println("てとてと");
	}
}


class DogDog extends Animals {
	public DogDog(int getAge){
		super(getAge);
	}
	
	public void bite() {
		System.out.println("がぶっ");
	}
}

class CatCat extends Animals {
	public CatCat(int getAge){
		super(getAge);
	}
	
	public void scratch() {
		System.out.println("ざしゅっ");
	}
}

public class Ex09_01 {
	public static void main(String args[]) {
		DogDog dog = new DogDog(10);
		CatCat cat = new CatCat(5);
		
		dog.Walk();
		dog.bite();
		
		cat.Walk();
		cat.scratch();
		
	}
}
