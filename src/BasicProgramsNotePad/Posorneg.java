import java.util.*;
class Posorneg
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		if(n>0)
		    System.out.println(n+"is a positive number");
		else
		    System.out.println(n+"is a negative number");
	}
}
