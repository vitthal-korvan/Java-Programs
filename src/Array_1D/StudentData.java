package Array_1D;
/*
Accept the name, physics, chemistry and math marks of 25 students. The display a list
of the given data with Total and Average.
 */
import java.util.Scanner;

public class StudentData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[25];
        int[] physicsMarks = new int[25];
        int[] chemistryMarks = new int[25];
        int[] mathMarks = new int[25];

        System.out.println("Enter data for 25 students:");

        for (int i = 0; i < 25; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.print("Enter Physics marks: ");
            physicsMarks[i] = scanner.nextInt();
            System.out.print("Enter Chemistry marks: ");
            chemistryMarks[i] = scanner.nextInt();
            System.out.print("Enter Math marks: ");
            mathMarks[i] = scanner.nextInt();
        }

        System.out.println("\nStudent Data with Total and Average:");

        for (int i = 0; i < 25; i++) {
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathMarks[i];
            double averageMarks = totalMarks / 3.0;

            System.out.println("Name: " + names[i] +
                    ", Physics: " + physicsMarks[i] +
                    ", Chemistry: " + chemistryMarks[i] +
                    ", Math: " + mathMarks[i] +
                    ", Total: " + totalMarks +
                    ", Average: " + averageMarks);
        }
    }
}
