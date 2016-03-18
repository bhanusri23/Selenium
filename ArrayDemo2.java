
public class Arrays2Demo {

	public static void main(String[] args) {
		int [][] a = new int [3][3];
		
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i = 0;i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				System.out.println(a[i][j]);
			}
		}
			
	}

}

