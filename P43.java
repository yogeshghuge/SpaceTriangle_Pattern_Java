/*
    E
   ED
  EDC
 EDCB
EDCBA
*/

class P43
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1;i--)
		{
			for(int j=i; j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=n; j>=i;j--)

			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}