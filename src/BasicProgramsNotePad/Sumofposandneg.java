import java.util.*;
class Sumofposandneg
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n,i,psum=0,nsum=0,num;

		System.out.println("Enter the value of n");
		n=sc.nextInt();

		i=1;
		while(i<=n)
		{
			System.out.println("enter the number");
			num=sc.nextInt();
			if(num>0)
				psum=psum+num;
			else if(num<0)
				nsum=nsum+num;
			else
			     break;

			i++;
		}
		System.out.println("sum of positive numbers="+psum);
		System.out.println("sum of negative numbers="+nsum);
	}
}