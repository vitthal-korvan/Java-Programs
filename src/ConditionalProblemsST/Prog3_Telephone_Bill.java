package ConditionalProblemsST;

import java.util.Scanner;

public class Prog3_Telephone_Bill {
    public static void main(String[] args) {
        //Problem::
        //The telephone department wishes to compute monthly telephone bills for its customers
        // using the following rules. Minimum Rs. 250 for first 80 message units, plus
        // 60 paise per unit for next 60 units, plus 50 paise per unit for next 60 units,
        // plus 40 paise per unit for any units above 200. Write a program that calculates the
        // monthly bill, with input MESSAGE (the number of message units) and CUSTNO (the
        // registration number of a customer). Then Display the bill in following format.
        // CUSTOMER NO :
        // MESSAGE UNITS :
        // AMOUNT (Rs.) :
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer number: ");
        int custNo = sc.nextInt();
        System.out.println("Enter messages: ");
        int message = sc.nextInt();
        int limitedMessages = 80;
        int chargeMessages = message - limitedMessages;
        float amount = 250.0f;

        float amount2 = 0, amount3=0;
        if (message > 0 && message <= 80) {
            System.out.println("CUSTOMER NO : " + custNo);
            System.out.println("MESSAGE UNITS : " + message);
            System.out.println("AMOUNT (Rs.) : " + amount);
        } else if (message > limitedMessages && message <= limitedMessages + 60) {
            amount2 = amount + chargeMessages * 0.6f;
            System.out.println("CUSTOMER NO : " + custNo);
            System.out.println("MESSAGE UNITS : " + message);
            System.out.println("AMOUNT (Rs.) : " + amount2);
        } else if ((message > (limitedMessages + 60)) && (message <= (limitedMessages + 140))) {
            amount3 = amount2 + chargeMessages * 0.5f;
            System.out.println("CUSTOMER NO : " + custNo);
            System.out.println("MESSAGE UNITS : " + message);
            System.out.println("AMOUNT (Rs.) : " + amount3);
        }
    }
}
