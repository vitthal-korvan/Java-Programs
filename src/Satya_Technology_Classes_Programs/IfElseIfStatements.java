package Satya_Technology_Classes_Programs;

import java.util.Scanner;

//if-else-if statement::

//syntax::
//if(condition1){
//      statements;
//}
//else if(condition 2){
//  statements;
//}
//else if(condition 3){
//  statements;
//}
//else{
//  statements;
//}

//if else if statements::
//if a programmer wants to choose 1 among the several alternatives then we use if
// else if statements.
//In if else if statements a series of if conditions are formulated with an else statement

public class IfElseIfStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Program 1::
        //check the person is dwarf 150 , 165 average, 180 tall, abnormal person

//        float height = sc.nextFloat();
//        if(height<150.0f)
//            System.out.println("The Person is Dwarf");
//        else if (height>=150.0f && height<=165.0f)
//            System.out.println("The person height is average");
//        else if (height>165.0f && height<=180.0f)
//            System.out.println("The person is taller");
//        else
//            System.out.println("The person height is abnormal");

        //Program 2::
        //read x and y values and define value belongs to which quadrant

//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        if(x>0 && y<0)
//            System.out.println("("+x+","+y+")"+"belongs to fourth quadrant");
//
//        else if (x>0 && y>0)
//            System.out.println("("+x+","+y+")"+"belongs to first quadrant");
//
//        else if (x<0 && y>0)
//            System.out.println("("+x+","+y+")"+"belongs to second quadrant");
//
//        else if (x<0 && y<0)
//            System.out.println("("+x+","+y+")"+"belongs to third quadrant");
//        else
//            System.out.println("("+x+","+y+")"+"belongs to origin");

        //Program 3::
        //to calculate the electricity bill read the current and previous meter reading.
        //the charges given as follows w.r.t slabs
        //No. of. units consumed:                       rate
        //      0-100                                   0.80
        //      100-200                                 1.2
        //      200-300                                 1.5
        //      >300                                    1.8

//        float current = sc.nextFloat();
//        float previous = sc.nextFloat();
//        float units = current - previous;
//        if(units>=0 && units<100)
//            System.out.println("The bill is: "+units*0.8f);
//
//        else if (units>=100 && units<200)
//            System.out.println("The bill is: "+80+(units-100)*1.2f);
//
//        else if (units>=200 && units<300)
//            System.out.println("The bill is: "+200+(units-200)*1.5f);
//
//        else
//            System.out.println("The bill is: "+350+(units-300)*1.8f);

        //Program 4::
        //to calculate the gross salary of the employee for the conditions given below:
        //basic sal         DA              HRA             Conveyance
        //>=5000            110%            20%             500
        //>=3000 && <5000   100%            15%             300
        //<3000             90%             10%             200

//        float basic_sal= sc.nextInt();
//        float da = 0;
//        float hra = 0;
//        float conveyance = 0;
//
//
//        if(basic_sal>=5000 ) {
//            da = basic_sal * 1.1f;
//            hra = basic_sal * 0.2f;
//            conveyance = 500;
//        }
//
//
//        else if (basic_sal>=3000 && basic_sal<5000){
//            da = basic_sal;
//            hra = basic_sal * 1.5f;
//            conveyance = 300;
//        }
//
//
//        else {
//            da = basic_sal * 0.9f;
//            hra = basic_sal * 0.1f;
//            conveyance = 300;
//        }
//        float gross_salary = basic_sal + da + hra + conveyance;
//
//        System.out.println("The salary is: "+gross_salary);


        //Program 5::
        //to find the average marks of 6 subjects of the student and display the result as
        //follows
        //      Average                              Result
        //    >=35 to <50                            3rd division
        //    >=50 and <60                           2nd division
        //    >=60 and <70                           1st division
        //    >=70                                   Distinction
        //     <35                                   Fail

//        int s1= sc.nextInt();
//        int s2= sc.nextInt();
//        int s3= sc.nextInt();
//        int s4= sc.nextInt();
//        int s5= sc.nextInt();
//        int s6= sc.nextInt();
//
//        if(s1<35||s2<35||s3<35||s4<35||s5<35||s6<35){
//            System.out.println("Fail");
//        }
//
//        float average = ((s1+s2+s3+s4+s5+s6)/6.0f);
//
//        if(average>=35 && average<50 )
//            System.out.println("3rd division");
//        else if (average>=50 && average<60)
//            System.out.println("2rd division");
//        else if (average>=60 && average<70)
//            System.out.println("1st division");
//        else
//            System.out.println("Distinction");


    }
}
