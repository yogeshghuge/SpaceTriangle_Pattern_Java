/*
54321
 5432
  543
   54
    5
*/

class P49
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}