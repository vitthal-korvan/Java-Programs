import java.lang.Math;
class Mathoperations
{
	public static void main(String args[])
	{
		int a=4,d=50;
		int b=-5;
		float c=3.142f;
		int f=10;
		int min=0,max=100;
		int x=30,y;

		System.out.println(Math.pow(a,2));
		System.out.println(Math.abs(b));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.cbrt(a));
		System.out.println(Math.floor(c));
		System.out.println(Math.ceil(c));
		System.out.println(Math.max(a,d));
		System.out.println(Math.min(a,d));
		System.out.println(Math.exp(a));
		System.out.println(Math.log(a));
		System.out.println(Math.log10(f));
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*(max-min+1)+min));

		
		System.out.println(Math.sin(Math.toRadians(x)));
		System.out.println(Math.cos(Math.toRadians(x)));
		System.out.println(Math.tan(Math.toRadians(x)));
	}
}