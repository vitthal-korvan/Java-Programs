import java.io.*;
class Palindrome
{
	public static void main(String args[])
	{
		int n=143;
		String str;

		str=(n%10==n/100)?"palindrome":"not";

		System.out.println(str);
	}
}

		
		
		