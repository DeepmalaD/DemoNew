
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		/*String username="XXXX";
		String password="yyyy";
	    String email="ase@gmail.com";
		String zipcode="12356";
		String city="Newyork";*/

		String str[]= new String[5];
		
		str[0]="XXXX";
		str[1]="yyyy";
		str[2]="ase@gmail.com";
		str[3]="12356";
		str[4]="Newyork";
		
		int i[]=new int[6];
		i[0]=1;
		i[2]=2;
		i[3]=3;
		i[4]=4;
		i[5]=5;
		
		char c[]=new char[6];
		
		//length of array
		System.out.println(str.length);
		System.out.println(i.length);
		System.out.println(c.length);
		
		
		for (int x=0; x<str.length; x++)
		{
			System.out.println(str[x]);
		}
		
		
	}

}
