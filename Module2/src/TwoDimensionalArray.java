
public class TwoDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int a[] []=new int[3] [4];
		a[0][0]=200;
		a[0][1]=300;
		a[0][2]=400;
		a[0][3]=500;

		a[1][0]=600;
		a[1][1]=700;
		a[1][2]=800;
		a[1][3]=900;
		
		a[2][0]=10;
		a[2][1]=11;
		a[2][2]=12;
		a[2][3]=13;
		
	int row= a.length;
	int col=a[0].length;
	//System.out.println("length of rows=" +row);
	//System.out.println("length of col=" +col);
	
	for (int x=0;x<=a.length;x++)
	{
		for (int y=0;y<col;y++)
		{
			System.out.print(a[x][y]+ "  ");
			
			
		}
			
		{
			
			System.out.println();
	}
	
		
	}

	}}
