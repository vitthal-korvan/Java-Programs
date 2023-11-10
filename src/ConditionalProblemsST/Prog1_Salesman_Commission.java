package ConditionalProblemsST;

import java.util.Scanner;

public class Prog1_Salesman_Commission {
    public static void main(String[] args) {
        //Problem::
        //A computer salesman gets commission on the following basis:
        //      Sales                Commission Rate
        // Rs. 0 - 20,000                3%
        // Rs. 20,000 - 50,000          12%
        // Rs. 50,001 and more          31%
        //After accepting the sales as input, calculate and print his commission amount and
        // rate of commission.

        Scanner sc= new Scanner(System.in);
        float sales = sc.nextFloat();
        float comm_amount,comm_rate;
        if(sales>=0 && sales<20000){
            comm_rate = 3;
            comm_amount = ((sales*3.0f)/100.0f);
            System.out.println(comm_rate+"%");
            System.out.println(comm_amount);
        } else if (sales>=20000 && sales<=50000) {
            comm_rate = 12;
            comm_amount = ((sales*12.0f)/100.0f);
            System.out.println(comm_rate+"%");
            System.out.println(comm_amount);
        }else if (sales>=50001) {
            comm_rate = 31;
            comm_amount = ((sales*31.0f)/100.0f);
            System.out.println(comm_rate+"%");
            System.out.println(comm_amount);
        }
        else
            System.out.println("Invalid Value");
    }
}
