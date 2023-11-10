import java.util.*;
class Swapoftwo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a,b,temp;

		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();

		System.out.println("Before Swapping:value of a="+a+"value of b="+b);

		//temp=a;
		//a=b;
		//b=temp;
	        a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After Swapping:value of a="+a+"value of b="+b);

	}
}