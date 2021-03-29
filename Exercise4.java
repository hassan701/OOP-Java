
public class Exercise4 {

	public static void main(String[] args) {
		for(int i=1; i <= 500; i++) {
			if(PrimeCheck(i)==true) {
				System.out.printf(i+" Is a Prime Number\n");
				
			}else {	
				System.out.printf(i+" Is a NOT Prime Number\n");
			
			}	
		}	
	}
	
	static boolean PrimeCheck(int args){
		boolean bool=(args==1) ? false : true;;
		for(int i = 2; i <= args / 2; ++i) {
		    if (args % i == 0) {
		    	bool=false;
		    	break;
		    }
		}
		
		return bool;
	}
	
	
	
	
}