public class FactOfSum {

	public static void main(String[] args) {
		int rev, a, sum = 0,n = 145;
		rev =  n% 10;
		a = fact(n);
		sum = sum + a;
		
		System.out.println(sum);
	}
	
	public static int fact(int n)
	{
		int prod = 1;
		for (int i =1;i <= n; i++)
		{
			prod = prod * i;
		}
		return prod;
	}

}

