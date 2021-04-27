import java.util.Scanner;

public class Interface {
	public static void main(String[] args) {
		Scanner IN = new Scanner(System.in);
		
        System.out.print("What is the name of your Bank : ");
        String b = IN.next();
        System.out.print("How many customeres do you expect to have: ");
        int n = IN.nextInt();
        bank Bank = new bank(b,n);
        
        int ch;
        do {
            System.out.println("Main Menu\n1. Display All\n 2. Add customer\n 3. Search By Account\n 4. Deposit\n 5. Withdrawal\n 6.E xit ");
                System.out.println("Ur Choice :"); ch = IN.nextInt();
                switch (ch) {
                    case 1:
                        for (int i = 0; i < Bank.numofCustomer; i++) {
                            Bank.getCustomer(i);
                        }
                        break;
                        
                    case 2:
                    	System.out.print("Enter first Name: ");
                        String fname = IN.next();
                        System.out.print("Enter last Name: ");
                        String lname = IN.next();
                        System.out.print("Enter Starting Balance: ");
                        int bal = IN.nextInt();
                        Bank.addCustomer(fname, lname, bal);
                        System.out.print("Your account Index is:"+(Bank.getnumofCustomer()-1));
                        break;

                    case 3:
                        System.out.print("Enter Account No. You Want to Search...: ");
                        int acn = IN.nextInt();
                        if(acn < Bank.numofCustomer) {
                        	Bank.getCustomer(acn);
                        }else {
                        	System.out.println("Search Failed...\n");
                            }
                        break;

                    case 4:
                        System.out.print("Enter Account No : ");
                        acn = IN.nextInt();
                        if(acn < Bank.numofCustomer) {
                        	System.out.print("Enter amount: ");
                        	int amo = IN.nextInt();
                        	Bank.customers[acn].account.deposit(amo);
                        }else {
                        	System.out.println("Search Failed...\n");
                            }
                        break;

                    case 5:
                    	System.out.print("Enter Account No : ");
                        acn = IN.nextInt();
                        if(acn < Bank.numofCustomer) {
                        	System.out.print("Enter amount: ");
                        	int amo = IN.nextInt();
                        	Bank.customers[acn].account.withdraw(amo);
                        }else {
                        	System.out.println("Search Failed...\n");
                            }
                        break;

                    case 6:
                        System.out.println("Thank you for using oursevice..\n");
                        break;
                }
            }
            while (ch != 6);
		
		
	}
	
}



class bank {
	Customer customers [];
	int numofCustomer=0;
	String Bankname;
	
	public bank(String bn,int n){
		Bankname = bn; 
		customers = new Customer[n];
	}
	void addCustomer(String f, String l, int b){
		customers[numofCustomer]= new Customer(f,l,b);
		numofCustomer++;
		customers[numofCustomer-1].getfirstname();
		
	}
	int getnumofCustomer() {
		return numofCustomer;
	}
	
	void getCustomer(int index){
		customers[index].getfirstname();
		customers[index].getlastname();
		customers[index].getAccoount();
		
		
	}
	
	
 }

class Customer {
	String firstname;
	String lastname;
	Account account;
	
	public Customer(String f, String l, double iniBal){
		firstname = f;
		lastname = l;
		account = new Account(iniBal);
	}
	
	void getfirstname() {
		System.out.print("firstname: "+firstname+"\n");
	}
	
	void getlastname() {
		System.out.print("Lastname: "+lastname+"\n");
	}
	
	void setAccoount(double iniBal){
		account = new Account(iniBal);
	}
	
	void getAccoount(){
		account.getbalance();
	}
	
	
}


class Account {
	double  balance;
	
	public Account(double iniBal){
		balance = iniBal;
	}
	
	void getbalance() {
		System.out.print("Balance: "+balance+"\n");
	}
	
	public void deposit (double amt){
		if (amt<0  ){
			System.out.print("Amount is Zero"+"\n");
		}else {
			balance += amt;
		}
	}
	
	
	public void withdraw(double amt){
		if ((balance-amt) < 0  ){
			System.out.print("Not enough in your account"+"\n");
		}else {
			balance -= amt;
			
		}
	}
	
	
}