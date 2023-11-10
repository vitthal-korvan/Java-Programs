import java.util.*;
class Vowelornot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		char ch;

		System.out.println("Enter the character");
		ch=sc.next().charAt(0);

		switch(ch)
		{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("IT IS A VOWEL");
				  break;
			default:  System.out.println("IT IS A CONSONANT");
		}
	}
}
		
	
