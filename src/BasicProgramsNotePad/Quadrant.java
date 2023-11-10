import java.util.*;
class Quadrant
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x,y;

		System.out.println("enter the values of x and y");
		x=sc.nextInt();
		y=sc.nextInt();

		if(x>0 && y>0)
			System.out.println("("+x+","+y+")"+"belongs to first quadrant");
		else if(x<0 && y>0)
			System.out.println("("+x+","+y+")"+"belongs to second quadrant");
		else if(x<0 && y<0)
			System.out.println("("+x+","+y+")"+"belongs to third quadrant");
		else if(x>0 && y<0)
			System.out.println("("+x+","+y+")"+"belongs to fourth quadrant");
		else
			System.out.println("("+x+","+y+")"+"belongs to origin");
	}
}