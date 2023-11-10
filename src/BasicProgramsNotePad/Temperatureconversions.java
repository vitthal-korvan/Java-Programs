import java.util.*;
class Temperatureconversions
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		float ct=0,ft=0,kt=0,it;

		char choice;

		System.out.println("******TEMPERATURE CONVERSIONS*****");
		System.out.println("F: FAHRENHEIT TEMPERATURE");
		System.out.println("C: CELSISUS TEMPERATURE");
		System.out.println("K: KELVIN TEMPERATURE");

		System.out.println("Enter the initial temperature");
		it=sc.nextFloat();

		System.out.println("enter the choice");
		choice=sc.next().charAt(0);

		switch(choice)
		{
			case 'F': ft=it;
				  ct=(ft-32.0f)*5/9;
				  kt=ct+273.03f;
		System.out.println("Celsius temperature="+ct);
		System.out.println("Fahrenheit temperature="+ft);
		System.out.println("Kelvin temperature="+kt);
		
				  break;

			case 'C': ct=it;
				  ft=(ct*9)/5+32.0f;
				  kt=ct+273.03f;
		System.out.println("Celsius temperature="+ct);
		System.out.println("Fahrenheit temperature="+ft);
		System.out.println("Kelvin temperature="+kt);
		
				  break;
			case 'K': kt=it;
				  ct=kt-273.03f;
				  ft=(ct*9)/5+32.0f;
		System.out.println("Celsius temperature="+ct);
		System.out.println("Fahrenheit temperature="+ft);
		System.out.println("Kelvin temperature="+kt);
		
				  break;
			default: System.out.println("Invalid option");
		}
		
	}
}
		
	
