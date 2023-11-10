import java.util.*;
class Nearestnumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,r;

		System.out.println("enter the values of n");
		n=sc.nextInt();
		
		r=n%5;

		if(r==0)
			System.out.println(n+"is divisible by 5");
		else
		{
		   if(r>2)
			System.out.println(n-r+5);
		   else
			System.out.println(n-r);
		}

	}
}
