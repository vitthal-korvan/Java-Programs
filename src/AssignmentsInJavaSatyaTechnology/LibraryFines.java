package AssignmentsInJavaSatyaTechnology;
import java.util.Scanner;
//Assignment 3::
//Library fines:
//      Days                    Charges
//      5 days                   40 paise
//      6 to 10                  65 paise
//      above 10                 80 paise
// Book is returned N days late.

public class LibraryFines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of days the book is returned late
        System.out.println("Enter the number of days the book is returned late: ");
        int daysLate = sc.nextInt();

        float fine = 0.0f;

        if (daysLate <= 5) {
            fine = 0.40f; // 40 paise fine for up to 5 days
        } else if (daysLate >= 6 && daysLate <= 10) {
            fine = 0.65f; // 65 paise fine for 6 to 10 days
        } else {
            fine = 0.80f; // 80 paise fine for more than 10 days
        }

        float totalFine = fine * daysLate;

        System.out.println("Book is returned " + daysLate + " days late.");
        System.out.println("Fine per day: " + fine + " paise");
        System.out.println("Total fine: " + totalFine + " paise");


    }
}
