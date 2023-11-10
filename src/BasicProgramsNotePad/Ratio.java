import java.util.*;
class Ratio
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		float x,y,ratio,temp;

		System.out.println("enter the values of x and y");
		x=sc.nextFloat();
		y=sc.nextFloat();

		ratio=x/y;

		if(ratio>0)
		{
			temp=x;
			x=y;
			y=temp;
		}
		System.out.println("value of x="+x+"value of y="+y);
		
	}
}