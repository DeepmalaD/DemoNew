
public class Fibonacci_With_Recursion {

	
	static int n1=0,n2=1,n3,num=10,x,i=2;

	public static void main(String[] args) {

		
		System.out.print(n1+" "+n2);
		
		
		printFibonnaci(num-2);
		
		
		
	}
	
	
	
	
	public static void printFibonnaci(int x) {
		
		if(i<x) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		
		System.out.print(" "+n3);
	
		
		printFibonnaci(x-1);

		}
		
		
	}

}
