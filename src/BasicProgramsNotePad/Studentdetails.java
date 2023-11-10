import java.util.*;
class Studentdetails
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int rollno;
		String name="";
		char gender;
		String branch;
		int semester;
		float marks;

		System.out.println("enter the roll number of a student");
		rollno=sc.nextInt();

		sc.nextLine();

		System.out.println("enter the name of the student");
		name=sc.nextLine();

		

		System.out.println("enter the gender");
		gender=sc.next().charAt(0);
		
		System.out.println("enter the branch");
		branch=sc.next();

		System.out.println("enter the semester");
		semester=sc.nextInt();

		System.out.println("enter the marks");
		marks=sc.nextFloat();

		System.out.println("STUDENT DETAILS:");
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(branch);
		System.out.println(semester);
		System.out.println(marks);

	}
}

		