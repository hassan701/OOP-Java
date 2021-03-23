import java.util.ArrayList;
import java.util.Vector;
	public class Exercise3 {
		
		public static void main(String[] args) {
			String[] Names= {"Morris Kim","Raffles Teh Weihan","Jason Jeremy Wijadi","Ariel Putra","Dhifan Denon Fauzan"};
			String[] ID = {"2440074174","2440102493","2440077301","2440100273","2440100336"};
			String[] Color = {"Violet","Green","White","Yellow","Blue"};
			String temp;
			
			//Order by Names
			System.out.printf("%nOrdred by Names%n");
			for(int x=0;x<Names.length-1;x++) {
				for(int i=0;i<Names.length-1;i++) {
					if((int) Names[i].charAt(0)> (int) Names[i+1].charAt(0)) {
						temp= Names[i];Names[i]=Names[i+1];Names[i+1]= temp;
						temp= ID[i];ID[i]=ID[i+1];ID[i+1]= temp;
						temp= Color[i];Color[i]=Color[i+1];Color[i+1]= temp;
					}	
				}
			}
			//Print
			for (int i = 0; i<Names.length; i++) {
	                System.out.print(ID[i]+" | "+Names[i] + " | "+Color[i]+"\n");
	            }
			
			
			//Order by Color
			System.out.printf("%nOrdred by Color%n");
			for(int x=0;x<Names.length-1;x++) {
				for(int i=0;i<Names.length-1;i++) {
					if((int) Color[i].charAt(0)> (int) Color[i+1].charAt(0)) {
						temp= Names[i];Names[i]=Names[i+1];Names[i+1]= temp;
						temp= ID[i];ID[i]=ID[i+1];ID[i+1]= temp;
						temp= Color[i];Color[i]=Color[i+1];Color[i+1]= temp;
					}	
				}
			}
			//Print
			for (int i = 0; i<Names.length; i++) {
	               System.out.print(ID[i]+" | "+Names[i] + " | "+Color[i]+"\n");
	            }
			
			
			//Making the Arraylists
			 ArrayList<String> Name = new ArrayList<String>();
			 ArrayList<String> Colour = new ArrayList<String>();
			 Vector<String> id = new Vector<String>();
			 	Name.add("Morris Kim");Name.add("Raffles Teh Weihan");Name.add("Jason Jeremy Wijadi");Name.add("Ariel Putra");Name.add("Dhifan Denon Fauzan");
			    Colour.add("Violet");Colour.add("Green");Colour.add("White");Colour.add("Yellow");Colour.add("Blue");
			    id.add("2440074174");id.add("2440102493");id.add("2440077301");id.add("2440100273");id.add("2440100336");

			    
			    //order by ID
			    System.out.printf("%nOrdred by Id%n");
			    
			    for(int x=0;x<Names.length-1;x++) {
					for(int i=0;i<Names.length-1;i++) {
						if(Long.parseLong(id.get(i))>Long.parseLong(id.get(i+1))) {
						temp= Name.get(i);Name.set(i,Name.get(i+1));Name.set(i+1,temp);
						temp= id.get(i);id.set(i,id.get(i+1));id.set(i+1,temp);
						temp= Colour.get(i);Colour.set(i,Colour.get(i+1));Colour.set(i+1,temp);
				}	}	};	
				//Print
				for (int i = 0; i<Names.length; i++) {
		                System.out.print(id.get(i)+" | "+Name.get(i) + " | "+Colour.get(i)+"\n");
		            }
				
				
				//Search
				System.out.printf("%nSearchs%n");
				String Search ="2440077301";
				for (String i : id) {
				      if(i ==Search) {
				    	  System.out.printf("%nId found\nIndex Number: "+id.indexOf(i));  
				      }
				    }
			
			
			
			
}
	}
