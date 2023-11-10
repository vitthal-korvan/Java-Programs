package Satya_Technology_Classes_Programs;
import java.util.Scanner;

public class StudentsDetailsScannerClass {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int rollno = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String branch = sc.nextLine();
        int semester= sc.nextInt();
        float marks=sc.nextFloat();
        char gender =sc.next().charAt(0);

        System.out.println("The student roll no is: "+rollno);
        System.out.println("The student name is: "+name);
        System.out.println("The student gender is: "+gender);
        System.out.println("The student branch is: "+branch);
        System.out.println("The student semester is: "+semester);
        System.out.println("The student marks is: "+marks);
    }
}
