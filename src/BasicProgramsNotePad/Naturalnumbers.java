import java.util.*;
class Naturalnumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n,i;

		System.out.println("Enter the value of n");
		n=sc.nextInt();

		i=1;
		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
	}
}