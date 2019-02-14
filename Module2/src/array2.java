
public class array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i[]=new int[5];
		i[0]=100;
		i[1]=200;
		i[2]=300;
		i[3]=400;
		i[4]=500;
		
	/*	
		for (int x=0; x<i.length;)
		{
			
			System.out.println(i[x]);
			
			{
			x++;
			}
		}
		*/
		System.out.println(i.length);

		for (int y=4;y<=i.length;y--)
		{
			System.out.println(i[y]);
			
		}
		
		
	}

}
