package SwitchProblemsST;
import java.util.*;
public class Prog2_GradeToGPA {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a grade letter
            System.out.print("Enter the grade letter (A, B, C, D, or F): ");
//            String grade = scanner.nextLine().toUpperCase();
//            Read the input and convert it to uppercase
            char grade =scanner.next().charAt(0);

            // Calculate and display the corresponding GPA value
            double gpa = 0.0;

            switch (grade) {
                case 'A':
                    gpa = 4.0;
                    break;
                case 'B':
                    gpa = 3.0;
                    break;
                case 'C':
                    gpa = 2.0;
                    break;
                case 'D':
                    gpa = 1.0;
                    break;
                case 'F':
                    gpa = 0.0;
                    break;
                default:
                    System.out.println("Invalid grade entered. Please enter A, B, C, D, or F.");
                    return; // Exit the program if an invalid grade is entered
            }

            System.out.println("The GPA value for grade " + grade + " is: " + gpa);

            scanner.close();
        }
}

