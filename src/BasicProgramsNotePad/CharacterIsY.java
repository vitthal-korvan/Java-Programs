import java.util.*;
public class CharacterIsY{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char inputChar = sc.next().charAt(0);
        	if (inputChar == 'y'|| inputChar == 'Y')
            		System.out.println("Yes");
        	else
            		System.out.println("No");
	}
}