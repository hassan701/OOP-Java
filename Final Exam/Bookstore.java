
public class Bookstore {
	 public static void main(String[] args){
		 Book book1 =new Book("Raymond Bahana", "Superheroes are Real", 15.50, 1719);
		 Book book2 =new Book("Nunung Nurul", "Falling in Love with Polymorphism", 12.80, 1902);
		 Book book3 = new Book("Jude Martinez", "Bleh Bleh Bleh Bleh", 9.50, 1996);
	 }
}

class Book{
	private String title;
	private double price;
	private int year;

	private String Aname;
	
	public Book(String t, String n, double p, int y){
		this.Aname=n;
		this.year =y;
		this.price=p;
		this.title =t;
	}
	
	
	
}
