/*
----5
---44
--333
-2222
11111
*/

class P34
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=n; j>i;j--)
			{
				System.out.print("-");
			}
			for(int j=n; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}