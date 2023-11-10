import java.io.IOException;
import java.util.Scanner;

public class StudentsDetailsScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollno = sc.nextInt();
        String name = sc.nextLine();
	sc.nextLine();
        char gender =sc.next().charAt(0);
        String branch = sc.nextLine();
        int semester= sc.nextInt();
        float marks=sc.nextFloat();

        System.out.println("The student roll no is: "+rollno);
        System.out.println("The student name is: "+name);
        System.out.println("The student gender is: "+gender);
        System.out.println("The student branch is: "+branch);
        System.out.println("The student semester is: "+semester);
        System.out.println("The student marks is: "+marks);
    }
}
