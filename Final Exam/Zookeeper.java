
public class Zookeeper {
	Lion leo = new Lion("Leo",300,5);
}

class Animal{
	private String Name;
	private int Weight ;
	public Animal(String n, int w) {
		this.Name =n;
		this.Weight=w;
	}
}

class Snake extends Animal{
	private int Length ;
	public Snake(String n, int w, int l) {
		super(n, w);
		this.Length=l;
	}
	
}

class Lion extends Animal{
	private int meat;
	public Lion(String n, int w, int m) {
		super(n, w);
		this.meat=m;
	}
	
}

class monkey extends Animal{
	private String food;
	public monkey(String n, int w, String f) {
		super(n, w);
		this.food=f;
	}
	
	
}