public class Case1 {
	public static SalesPerson[] salesPeople;
	 public static void main(String[] args){
	 salesPeople = new SalesPerson[6];
	 salesPeople[0] = new SalesPerson("100");
	 salesPeople[1] = new SalesPerson("101");
	 salesPeople[2] = new SalesPerson("102");
	 salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));
	 salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));
	 salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));
	 System.out.println(salesPeople[2].getId());
	 System.out.println(salesPeople[0].getCount());
	 System.out.println(salesPeople[1].getSalesHistory(0).getValue());
	 System.out.println(salesPeople[0].calcTotalSales());
	 System.out.println(highest());
	 
	 }
	 public static String highest() {
		 SalesPerson high = null;
		 double highest= 0;
		 for(int i=0;i<salesPeople.length;i++) {
			 if(salesPeople[i]!=null) {
				 if(salesPeople[i].largestSale()!=null) {
					 if(highest<salesPeople[i].largestSale().getValue()) {
						 high= salesPeople[i];
						 highest=high.largestSale().getValue();
				 }
				 }
			 }
		 }
		 return high.getId();
	 }
	 
	 public static void addSales(Sales s, String id) {
		 for(int i=0;i<salesPeople.length;i++) {
			 if(salesPeople[i]!=null) {
				 if(salesPeople[i].getId()==id) {
					salesPeople[i].setSalesHistory(s);
				 }
			 }
		 }
	 }

}

class Sales {
	// each object contains details of one sale
	private String itemId; // id of the item
	private double value; // the price of one item
	private int quantity; // the number of the items sold
	public Sales(String id, double price, int amount){
		this.itemId=id;
		this.value= price;
		this.quantity= amount;	
	}
	public double getValue() {return value;}
	public int getQuantity() {return quantity;}
	}


class SalesPerson {
	// each object contains details of one salesperson
	private String id;
	private Sales[] salesHistory; // details of the different sales
	private int count = 0; // number of sales made
	//constructor for a new salesperson
	public SalesPerson(String id){
		this.id= id;
		this.salesHistory = new Sales[100];
	
	}
	public Sales getSalesHistory(int i) {
		return this.salesHistory[i];
	}
	// constructor for a salesperson transferred (together with their sales details) from another branch
	public SalesPerson(String id, Sales[] s, int c){
		this.id= id;
		this.salesHistory = s;
		this.count = c;
	}
	public int getCount(){return count;}
	public String getId() {return id;}
	public void setSalesHistory(Sales s){
	salesHistory[count] = s;
	count = count +1;
	}
	public double calcTotalSales(){
		int total=0;
		for(int i=0;i<this.count;i++) {
			total+=this.salesHistory[i].getValue();
		}
		return total;
	}
	
	public Sales largestSale(){
		Sales high = null;
		double highest=0;
		for(int i=0;i<this.count;i++) {
			if(getSalesHistory(i).getValue()>highest) {
				highest = getSalesHistory(i).getValue();
				high=getSalesHistory(i);
			}
		}
		return high;
	}
	}

