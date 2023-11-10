import java.util.*;
public class GradeOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        char grade = sc.next().charAt(0);

        switch(grade){
            case 's':
            case 'S':
                System.out.println("Excellent");
                break;
            case 'a':
            case 'A':
                System.out.println("Very Good");
                break;
            case 'b':
            case 'B':
                System.out.println("Good");
                break;
            case 'c':
            case 'C':
                System.out.println("Poor");
                break;
            case 'y':
            case 'Y':
                System.out.println("Absent");
                break;
            case 'f':
            case 'F':    
                System.out.println("Fail");
                break;
            default:
                System.out.println("Not a grade");
        }
    }
}
