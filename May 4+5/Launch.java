class Knightmare {
	public void name() {
		System.out.print("This Knightmare Frame is named:...\n");
	}
	public void name(String name) {
		System.out.print("This Knightmare Frame is named:"+name+"\n");
	}
	public void Genration() {
		System.out.print("This is a ... Genration Knightmare Frame \n");
	}
	public void Pilot() {
		System.out.print("This Knightmare Frame is currently piloted by:...\n");
	}
	

}

class Lancelot extends Knightmare {
	public void name() {
		this.name("Lancelot");
	}
	public void Genration() {
		System.out.print("This is a 7th Genration Knightmare Frame\n");
	}
	@Override 
	public void Pilot() {
		System.out.print("This Knightmare Frame is currently piloted by: Suzaku Kururugi\n");
	}
}


public class Launch {
 public static void main(String[] args)
 {
	 Knightmare test = new Knightmare();
     test.name("Lancelot");
     Lancelot lancelot = new Lancelot();
     lancelot.name();
     lancelot.Genration();
     lancelot.Pilot();
 }
}