package AssignmentsInJavaSatyaTechnology;

import java.util.Scanner;

//Assignment 2::
//    Total Cost                          Discount(in percentage)
//  less than 2000                                   5%
//  2001 to 5000                                     25%
//  5001 to 10000                                    35%
//  above 10000                                      50%

//to input the total cost and compute and display the amount to be paid by the
//customer after availing the discount

public class TotalDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the total cost: ");
        float totalCost = scanner.nextFloat();

        float discount = 0.0f;

        if (totalCost < 2000) {
            discount = 0.05f; // 5% discount
        } else if (totalCost >= 2001 && totalCost <= 5000) {
            discount = 0.25f; // 25% discount
        } else if (totalCost >= 5001 && totalCost <= 10000) {
            discount = 0.35f; // 35% discount
        } else if (totalCost > 10000) {
            discount = 0.50f; // 50% discount
        }


        double amountToPay = totalCost - (totalCost * discount);


        System.out.println("Total Cost: " + totalCost);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Amount to be paid: " + amountToPay);

    }
}

