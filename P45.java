/*
11111
 2222
  333
   44
    5
*/

class P45
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=i; j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}