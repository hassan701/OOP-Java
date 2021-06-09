
public abstract class Abstract {
	public static void main(String[] args) {
		Hippo hipp= new Hippo();
		hipp.numTeeth();
	
	}
}
abstract class Animal{
	int numTeeth;
	public void numTeeth() {
		
	}
}

class Hippo extends Animal{
	int numTeeth=32;
	public void numTeeth() {
		System.out.print("Hungery Hippo got ");
		System.out.print(numTeeth);
		System.out.print(" teets.\n");
	}
}



