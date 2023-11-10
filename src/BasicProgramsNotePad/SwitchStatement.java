import java.util.*;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //to implement the simple calculator using switch statement
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int add,sub,mul,div,mod;
        char operator = sc.next().charAt(0);
        
        switch(operator){
            case '+':
                add = num1+num2;
                System.out.println("The Result is: "+add);
                break;
            case '-':
                sub = num1 - num2;
                System.out.println("The Result is: "+sub);
                break;
            case '*':
                mul = num1 * num2;
                System.out.println("The Result is: "+mul);
                break;
            case '/':
                div = num1/num2;
                System.out.println("The Result is: "+div);
                break;
            case '%':
                mod = num1%num2;
                System.out.println("The Result is: "+mod);
                break;
            default:
                System.out.println("Not a Operator");

        }
    }
}