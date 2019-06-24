
public class PrimeNumber {

	
	static int num=7;

	
	public static void main(String[] args) {

		
		if (num==0||num==1)
		
		{
			
			System.out.println(num +": is not a prime number ");
		}
			

		
		if(num>=2)
		{
			
			
			for (int i=2;i<=num;i++)
				
			{
				
				if(num%i==0)
				{
					System.out.println(num+ ": is not a prime number");
	
			}
				break;
	
			}
		

			
		}
		
		
		else {
		System.out.println(num+ ": is  a prime number");

		}
		
	}
	
}

