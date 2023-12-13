package CodingStudio;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
public class Divisors {

    public static void main(String[] args) {
        System.out.println(printDivisors(36));
    }
    public static List< Integer > printDivisors(int n) {

        List<Integer> divisors = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                divisors.add(i);
                if(n/i!=i){
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

}
