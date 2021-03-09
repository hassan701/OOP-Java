
public class Exercise1 {
	public static void main(String[] args) {
		char x='*';
		String y="";
		int n =5;
		//Right-angle triangle
		for(int i=0;i<n;i++) {
			y = y+x;
			System.out.print(y+"\n");
		}
		System.out.print("\n\n");
		//Upside down Right-angle triangle
		y= new String(new char[n]).replace('\0','*');
		for(int i=0;i<n;i++) {
			System.out.print(y+"\n");
			y = y.substring(0, i)+" "+y.substring(i+1);
		}
	
		//Isosceles triangle
		y= new String(new char[((n+1)*2)-1]);
		System.out.print(y+"\n");
		for(int i=0;i!=n;i++) {
			y = y.substring(0, n)+"*"+y.substring(n+1);
			y = y.substring(0, n+i)+"*"+y.substring((n+i)+1);
			y = y.substring(0, n-i)+"*"+y.substring((n-i)+1);
			System.out.print(y+"\n");
		}

	}
}
