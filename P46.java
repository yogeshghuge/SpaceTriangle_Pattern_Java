/*
55555
 4444
  333
   22
    1
*/

class P46
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1;i--)
		{
			for(int j=n; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}