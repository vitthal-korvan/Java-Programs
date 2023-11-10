package ConditionalProblemsST;

import java.util.Scanner;
public class Prog6_gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Problem::
        //Write a program to input the code of a particular item, quantity purchased
        // and rate. Then calculate the purchased price and print it along with gift to be
        // presented. The gifts to the customers are given in the following manner:
        //        Amount of Purchase (Rs.)              Gift
        //        Between 100 to 500                 A key ring
        //        Between 500 to 1000                A leather purse
        //        Above 1000                         A pocket calculator
        
        int item_code,quantity,rate,purchase_amount;
        String gift = null;
        System.out.print("Enter the Item Code: ");
        item_code= sc.nextInt();
        System.out.print("Enter the Quantity purchased: ");
        quantity= sc.nextInt();
        System.out.print("Enter the Item Rate: ");
        rate= sc.nextInt();
        purchase_amount = quantity * rate;
        if (purchase_amount>=100 && purchase_amount<=500)
            gift="A Key Ring";
        else if (purchase_amount>500 && purchase_amount<=1000) {
            gift="A leather purse";
        } else if (purchase_amount>1000) {
            gift="A pocket calculator";
        }
        else
            System.out.println("wrong details entered!");

        System.out.println("The purchase-value is: "+purchase_amount+" And the gift is: "+gift);
    }
    
}
