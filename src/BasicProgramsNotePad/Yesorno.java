import java.util.*;
class Yesorno
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;

		System.out.println("enter the character");
		ch=sc.next().charAt(0);

		if(ch=='Y'||ch=='y')
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
