/*
54321
 4321
  321
   21
    1
*/
class P50
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}