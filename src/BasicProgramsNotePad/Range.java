import java.util.*;
class Range
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,add;

		System.out.println("enter the values of a, b and c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		add=a+b+c;

		if(add>=100 && add<=200)	
			System.out.println(add+"is in the range of 100 to 200");
		else
			System.out.println(add+"is not in the range of 100 to 200");
	}
}
